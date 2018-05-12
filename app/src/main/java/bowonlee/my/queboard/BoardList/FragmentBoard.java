package bowonlee.my.queboard.BoardList;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import bowonlee.my.queboard.BaseFragment;
import bowonlee.my.queboard.R;
import bowonlee.my.queboard.models.BaseQuestData;

public class FragmentBoard extends BaseFragment {

    private List<BaseQuestData> dummyItem;

    private RecyclerView mBoardList;
    private BoardListAdapter mBoardAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return  inflater.inflate(R.layout.fragment_board,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mBoardList = (RecyclerView)view.findViewById(R.id.board_listview);

        mBoardAdapter = new BoardListAdapter();

        mBoardList.setLayoutManager(new LinearLayoutManager(null, LinearLayout.VERTICAL,false));

        makeDummy();

        mBoardList.setAdapter(mBoardAdapter);

        mBoardAdapter.setItem(dummyItem);

        mBoardAdapter.notifyDataSetChanged();


    }

    private void makeDummy(){

        dummyItem = new ArrayList<>();
        dummyItem.clear();

        ArrayList<String> taglist = new ArrayList<>();
        taglist.add("운동");
        taglist.add("스타트업");
        taglist.add("PT");
        taglist.add("tag4");
        taglist.add("tag5");
        taglist.add("tag6");
        taglist.add("tag7");


        for(int i =0;i<5;i++){
            dummyItem.add(new BaseQuestData(i,"dummy",taglist,true));
        }

    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    public static FragmentBoard newInstance(){
        return new FragmentBoard();
    }

}
