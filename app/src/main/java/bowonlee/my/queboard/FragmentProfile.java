package bowonlee.my.queboard;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

import java.util.ArrayList;
import java.util.List;


public class FragmentProfile extends BaseFragment {

    private BottomNavigationView bottomNavigationView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile,container,false);


        showRaderChart(view);
        initBottomNavi(view);
        return view;
    }

    public void initBottomNavi(final View view) {
        bottomNavigationView = view.findViewById(R.id.fragment_profile_bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_gallery: {
                        Intent intent = new Intent(view.getContext(), GalleryActivity.class);
                        startActivity(intent);
                        return true;
                    }
                    case R.id.action_project: {
                        Intent intent = new Intent(view.getContext(), ProjectActivity.class);
                        startActivity(intent);
                        return true;
                    }
                }
                return false;
            }
        });
    }

    public void showRaderChart(View view) {
        RadarChart chart = view.findViewById(R.id.fragment_profile_chart_profile);

        List<RadarEntry> entries = new ArrayList<>();

        entries.add(new RadarEntry(10f, 0));
        entries.add(new RadarEntry(10f, 1));
        entries.add(new RadarEntry(10f, 2));
        entries.add(new RadarEntry(10f, 3));
        entries.add(new RadarEntry(10f, 4));
        entries.add(new RadarEntry(10f, 5));
        entries.add(new RadarEntry(10f, 6));

        final String[] quarters = new String[] {"#Quest", "#PBP", "#10G", "#고려대", "#PPT", "#트레이너", "#대학교", "#PSP"};
        IAxisValueFormatter formatter = new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return quarters[(int) value];
            }
        };
        XAxis xAxis = chart.getXAxis();
        xAxis.setGranularity(1f);
        xAxis.setValueFormatter(formatter);

        RadarDataSet dataSet = new RadarDataSet(entries, "Profile"); // add entries to dataset
        dataSet.setColor(Color.RED);
        dataSet.setValueTextColor(Color.RED);

        RadarData radarData = new RadarData();

        radarData.addDataSet(dataSet);


        chart.setData(radarData);
        chart.invalidate(); // refresh
    }
}
