package bowonlee.my.queboard;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import bowonlee.my.queboard.home.HomeGallaryAdapter;
import bowonlee.my.queboard.models.HomeGallaryData;

public class FragmentHome extends BaseFragment {


    private RecyclerView mRecyclerView;
    private HomeGallaryAdapter mAdapter;

    private DividerItemDecoration dividerItemDecoration;
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

        dividerItemDecoration = new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL);
        mRecyclerView.addItemDecoration(dividerItemDecoration);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());


        setDummy();
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setDatas(dummy);


    }


    private void setDummy() {
        dummy = new ArrayList<>();
        ArrayList<String> tag1 = new ArrayList<>();
        tag1.add("#스타트업");tag1.add("#웨이트 트레이닝");tag1.add("#아주대");tag1.add("#오후 7시");tag1.add("#운동");tag1.add("#수원");
        ArrayList<String> tag2 = new ArrayList<>();
        tag2.add("#혼자여행");tag2.add("#게스트 하우스");tag2.add("#제주도");tag2.add("#인생샷");tag2.add("#사진");tag2.add("#가라지하우스");


        long now = System.currentTimeMillis();
        Date date = new Date(now);
        SimpleDateFormat sdf = new SimpleDateFormat("yymmdd");
        String getTime = sdf.format(date);

        dummy.add( new HomeGallaryData().setQuestData(R.drawable.sample_profile_1, 4, "박태현", tag1, false, true, 5, 3,
                "18/5/14", "18/5/15", "18/6/17"));
  //      dummy.add( new HomeGallaryData().setQuestData(R.drawable.sample_profile_2, 3, "temp", tag, true, true, 5, 3, getTime, getTime, getTime));
 //       dummy.add( new HomeGallaryData().setQuestData(R.drawable.sample_profile_3, 5, "temp", tag, true, true, 5, 3, getTime, getTime, getTime));


        dummy.add(new HomeGallaryData().setGallaryData(R.drawable.drawable_sample, 6, "asdfg2951", tag2, true, 3, 4, R.drawable.drawable_sample));

    }

    public void addDummy(){
        ArrayList<String> tag1 = new ArrayList<>();
        tag1.add("#수원");tag1.add("#아주대");
        tag1.add("#헬스");tag1.add("#저녁 7시");tag1.add("#파트너");
        dummy.add( new HomeGallaryData().setQuestData(R.drawable.sample_profile_1, 4, "박태현", tag1, false, false, 0, 0,
                "18/5/14", "18/5/15", "18/5/31"));
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
