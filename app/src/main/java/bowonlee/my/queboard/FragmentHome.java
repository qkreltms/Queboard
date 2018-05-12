package bowonlee.my.queboard;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import bowonlee.my.queboard.home.HomeGallaryAdapter;
import bowonlee.my.queboard.models.HomeGallaryData;

public class FragmentHome extends BaseFragment {


    private RecyclerView mRecyclerView;
    private HomeGallaryAdapter mAdapter;

    List<HomeGallaryData> dummy;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_home_recyclerview);
        mAdapter = new HomeGallaryAdapter();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(null, LinearLayout.VERTICAL, false));

        setDummy();
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setDatas(dummy);


    }


    public void setDummy() {
        dummy = new ArrayList<>();
        ArrayList<String> tag = new ArrayList<>();
        tag.add("#tag");
        tag.add("#tag");
        tag.add("#tag");
        tag.add("#tag");
        tag.add("#tag");
        for (int i = 0; i < 5; i++) {
            HomeGallaryData data = new HomeGallaryData().setQuestData(R.drawable.drawable_sample, i, "temp", tag, true, true, 5, 3, null, null, null);
            dummy.add(data);
        }

        HomeGallaryData data = new HomeGallaryData().setGallaryData(R.drawable.drawable_sample, 6, "gallary", tag, true, 3, 4, R.drawable.drawable_sample);
        dummy.add(data);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
