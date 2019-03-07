package com.example.ljj.constraintlayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ljj.constraintlayoutdemo.demolist.BarrierActivity;
import com.example.ljj.constraintlayoutdemo.demolist.CenteringAndBiasActivity;
import com.example.ljj.constraintlayoutdemo.demolist.ChainsActivity;
import com.example.ljj.constraintlayoutdemo.demolist.CircularPositioningActivity;
import com.example.ljj.constraintlayoutdemo.demolist.GuideLineActivity;
import com.example.ljj.constraintlayoutdemo.demolist.MarginsActivity;
import com.example.ljj.constraintlayoutdemo.demolist.MatchConstraintActivity;
import com.example.ljj.constraintlayoutdemo.demolist.RatioActivity;
import com.example.ljj.constraintlayoutdemo.demolist.RelativePositioningActivity;
import com.example.ljj.constraintlayoutdemo.util.ActivityHolder;

/**
 * created by ljj on 2017.11.24
 * 主要是对constraintLayout的属性进行介绍，分为以下几个部分：
 * 1、Relative positioning
 * 2、Margins
 * 3、Centering positioning
 * 4、Circular positioning
 * 5、Visibility behavior
 * 6、Dimension constraints
 * 7、Chains
 * 8、Virtual Helpers objects
 */
public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private ActivityHolder activityHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MainAdapter());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        initHolderActivity();

    }

    private void initHolderActivity() {
        activityHolder = new ActivityHolder();
        activityHolder.addActivity("Relative positioning", RelativePositioningActivity.class);
        activityHolder.addActivity("matchConstraint", MatchConstraintActivity.class);
        activityHolder.addActivity("centering and bias", CenteringAndBiasActivity.class);
        activityHolder.addActivity("Circular positioning", CircularPositioningActivity.class);
        activityHolder.addActivity("margin", MarginsActivity.class);
        activityHolder.addActivity("ratio", RatioActivity.class);
        activityHolder.addActivity("chains", ChainsActivity.class);
        activityHolder.addActivity("guideLine", GuideLineActivity.class);
        activityHolder.addActivity("Barrier",BarrierActivity.class);


    }

    private class MainAdapter extends RecyclerView.Adapter {

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.item_adapter, null);
            return new ViewHolder(view);
        }

        private class ViewHolder extends RecyclerView.ViewHolder {
            TextView titleTv;

            public ViewHolder(View itemView) {
                super(itemView);
                titleTv = (TextView) itemView;
            }
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            ViewHolder viewHolder = (ViewHolder) holder;
            final String name = activityHolder.getNameList().get(position);
            viewHolder.titleTv.setText(name);
            viewHolder.titleTv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    activityHolder.startActivity(MainActivity.this, name);
                }
            });
        }

        @Override
        public int getItemCount() {
            return activityHolder.getActivityMap().size();
        }
    }
}
