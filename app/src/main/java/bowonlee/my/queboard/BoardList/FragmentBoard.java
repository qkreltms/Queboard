package bowonlee.my.queboard.BoardList;

import android.os.Bundle;
import android.support.annotation.NonNull;
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

import bowonlee.my.queboard.BaseFragment;
import bowonlee.my.queboard.R;
import bowonlee.my.queboard.home.HomeGallaryAdapter;
import bowonlee.my.queboard.models.BaseQuestData;
import bowonlee.my.queboard.models.HomeGallaryData;

public class FragmentBoard extends BaseFragment {

    private List<BaseQuestData> dummyItem;

    private RecyclerView mBoardList;
    private HomeGallaryAdapter mGallaryAdapter;

    private DividerItemDecoration dividerItemDecoration;

    private List<HomeGallaryData> dummy;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return  inflater.inflate(R.layout.fragment_board,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mBoardList = (RecyclerView)view.findViewById(R.id.board_listview);


        mGallaryAdapter = new HomeGallaryAdapter();

        mBoardList.setLayoutManager(new LinearLayoutManager(null, LinearLayout.VERTICAL,false));

        dividerItemDecoration = new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL);
        mBoardList.addItemDecoration(dividerItemDecoration);
        mBoardList.setHasFixedSize(true);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getActivity());
        mBoardList.setLayoutManager(manager);
        mBoardList.setItemAnimator(new DefaultItemAnimator());




        setDummy();

        mBoardList.setAdapter(mGallaryAdapter);

        mGallaryAdapter.setDatas(dummy);

        mGallaryAdapter.notifyDataSetChanged();


    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    public void addDummy(){
        ArrayList<String> tag1 = new ArrayList<>();
        tag1.add("#수원");tag1.add("#아주대");
        tag1.add("#헬스");tag1.add("#저녁 7시");tag1.add("#파트너");
        dummy.add( new HomeGallaryData().setQuestData(R.drawable.sample_profile_1, 4, "박태현", tag1, false, false, 0, 0,
                "18/5/14", "18/5/15", "18/5/31"));
    }

    public static FragmentBoard newInstance(){
        return new FragmentBoard();
    }

    private void setDummy() {
        dummy = new ArrayList<>();
        ArrayList<String> tag = new ArrayList<>();
        ArrayList<String> tag1 = new ArrayList<>();
        ArrayList<String> tag2 = new ArrayList<>();
        ArrayList<String> tag3 = new ArrayList<>();
        ArrayList<String> tag4 = new ArrayList<>();

        tag.add("#운동");tag.add("#스카웃");tag.add("#깨알");tag.add("#큐보드");tag.add("#소세지");tag.add("#에너지바얌얌");tag.add("#오예스");tag.add("#닥터유");
        dummy.add( new HomeGallaryData().setQuestData(R.drawable.people, 4, "tkdqkewmdk12", tag, true, true, 65, 12,
                "18/5/14", "18/5/15", "18/7/13"));


        tag1.add("#스타트업");tag1.add("#웨이트 트레이닝");tag1.add("#아주대");tag1.add("#오후 7시");tag1.add("#운동");tag1.add("#수원");
        dummy.add( new HomeGallaryData().setQuestData(R.drawable.sample_profile_1, 4, "박태현", tag1, false, true, 5, 3,
                "18/5/14", "18/5/15", "18/6/17"));

        tag2.add("#여행");tag2.add("#제주도");tag2.add("#맛집");tag2.add("#자전거");tag2.add("#게하");tag2.add("#뚜벅이");tag2.add("#별밤");
        dummy.add( new HomeGallaryData().setQuestData(R.drawable.drawable_sample, 6, "이보원", tag2, false, true, 5, 3,
                "18/5/14", "18/5/15", "18/6/17"));

        //등산 , 과천, 관악산, 힌식, 둘이서, 자연주의
        tag3.add("#등산");tag3.add("#과천");tag3.add("#한식");tag3.add("#둘이서");tag3.add("#자연주의");
        dummy.add( new HomeGallaryData().setQuestData(R.drawable.sample_profile_2, 3, "김성영", tag3, false, true, 5, 3,
                "18/5/14", "18/5/15", "18/6/17"));

        tag4.add("#영어");tag4.add("#스터디");tag4.add("#잠실");tag4.add("#강남");tag4.add("#일요일");tag4.add("#오전");tag4.add("#중급회화");
        dummy.add( new HomeGallaryData().setQuestData(R.drawable.sample_profile_3, 5, "김준성", tag4, false, false, 5, 3,
                "18/5/14", "18/5/15", "18/6/17"));



    }
}
