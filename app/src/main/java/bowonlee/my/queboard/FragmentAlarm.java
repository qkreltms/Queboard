package bowonlee.my.queboard;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

import bowonlee.my.queboard.models.AlarmModel;
import bowonlee.my.queboard.models.ProjectModel;

public class FragmentAlarm extends BaseFragment {

    private Button friendButton;
    private Button teamButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alarm, container, false);

        friendButton = view.findViewById(R.id.fragment_alarm_button_friend);
        teamButton = view.findViewById(R.id.fragment_alarm_button_team);

        ArrayList<AlarmModel> messages = new ArrayList<>();
        messages.add(new AlarmModel("미니스탑으로 나왕", R.drawable.img1));
        messages.add(new AlarmModel("아이스크림 먹자", R.drawable.sample_profile_1));
        messages.add(new AlarmModel("ㅋㅋ", R.drawable.sample_profile_2));
        messages.add(new AlarmModel("힝힝 진짜져? 진짜에요,", R.drawable.sample_profile_3));
        messages.add(new AlarmModel("진짜 나가여~", R.drawable.img2));
        messages.add(new AlarmModel("옹옹 나오셈ㅎㅎ", R.drawable.img3));
        messages.add(new AlarmModel("아이 해버 팬~아이", R.drawable.img1));
        messages.add(new AlarmModel("해버 파인애플!", R.drawable.img1));
        messages.add(new AlarmModel("어!파인애플 팬!", R.drawable.img1));
        messages.add(new AlarmModel("애플팬~", R.drawable.img1));
        messages.add(new AlarmModel("파인애플팬~", R.drawable.img1));
        messages.add(new AlarmModel("어!", R.drawable.img1));
        messages.add(new AlarmModel("팬 파인애플 애플팬~", R.drawable.img1));
        messages.add(new AlarmModel("오 형도 알아요 그거?", R.drawable.img1));
        messages.add(new AlarmModel("나 무시하니 지금", R.drawable.img1));
        messages.add(new AlarmModel("아재석진이잖아요..", R.drawable.img1));

        final RecyclerView recyclerView = view.findViewById(R.id.fragment_alarm_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new AlarmActivityRecyclerViewAdapter(messages));
        recyclerView.setHasFixedSize(true);

        ArrayList<AlarmModel> messages1 = new ArrayList<>();
        messages1.add(new AlarmModel("혹시 12학번 이지은?", R.drawable.img4));
        messages1.add(new AlarmModel("잘 부탁드려여!", R.drawable.img5));
        messages1.add(new AlarmModel("아 안녕하세요.", R.drawable.img6));
        messages1.add(new AlarmModel("저 09학번 ~라고 합니다.", R.drawable.img7));
        messages1.add(new AlarmModel("아...네ㅋ", R.drawable.img8));
        messages1.add(new AlarmModel("카톡할수있죠?", R.drawable.img1));
        messages1.add(new AlarmModel("...죄송한데", R.drawable.img2));
        messages1.add(new AlarmModel("챕터7장맞나여??", R.drawable.img4));
        messages1.add(new AlarmModel("그래서 자료준비 못했지?", R.drawable.img4));
        messages1.add(new AlarmModel("네 알겠어요 좀따 언제봐요?", R.drawable.img4));
        messages1.add(new AlarmModel("수업 시작하기 전...", R.drawable.img4));
        messages1.add(new AlarmModel("제가 지금 밖이라...", R.drawable.img4));
        messages1.add(new AlarmModel("물론이죠!!!", R.drawable.img4));
        messages1.add(new AlarmModel("저 정말 열심히 할게여 ㅜㅜ!", R.drawable.img4));
        messages1.add(new AlarmModel("제가 지금 몸이 안좋아서...", R.drawable.img4));
        messages1.add(new AlarmModel("하... 네.. 시간 좀", R.drawable.img4));

        final RecyclerView recyclerView1 = view.findViewById(R.id.fragment_alarm_recyclerView1);
        recyclerView1.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView1.setAdapter(new AlarmActivityRecyclerViewAdapter(messages1));
        recyclerView1.setHasFixedSize(true);

        friendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                recyclerView1.setVisibility(View.GONE);
            }
        });

        teamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView1.setVisibility(View.VISIBLE);
                recyclerView.setVisibility(View.GONE);
            }
        });


        return view;
    }

    class AlarmActivityRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        List<AlarmModel> quests;

        public AlarmActivityRecyclerViewAdapter(ArrayList<AlarmModel> arrayList) {
            quests = arrayList;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);

            return new AlarmActivityRecyclerViewAdapter.CustomViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            ((AlarmActivityRecyclerViewAdapter.CustomViewHolder) holder).textView.setText(quests.get(position).title);

            Glide.with(holder.itemView.getContext())
                    .load(quests.get(position).pictureUrl)
                    .apply(new RequestOptions().circleCrop())
                    .into(((AlarmActivityRecyclerViewAdapter.CustomViewHolder) holder).imageView);
        }

        @Override
        public int getItemCount() {
            return quests.size();
        }

        private class CustomViewHolder extends RecyclerView.ViewHolder {

            public TextView textView;
            public ImageView imageView;

            public CustomViewHolder(View view) {
                super(view);
                textView = view.findViewById(R.id.item_project_textView);
                imageView = view.findViewById(R.id.item_project_imageView);
            }
        }
    }

    class AlarmActivityRecyclerViewAdapter1 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        List<AlarmModel> quests;

        public AlarmActivityRecyclerViewAdapter1(ArrayList<AlarmModel> arrayList) {
            quests = arrayList;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);

            return new AlarmActivityRecyclerViewAdapter1.CustomViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            ((AlarmActivityRecyclerViewAdapter.CustomViewHolder) holder).textView.setText(quests.get(position).title);

            Glide.with(holder.itemView.getContext())
                    .load(quests.get(position).pictureUrl)
                    .apply(new RequestOptions().centerCrop())
                    .into(((AlarmActivityRecyclerViewAdapter.CustomViewHolder) holder).imageView);
        }

        @Override
        public int getItemCount() {
            return quests.size();
        }

        private class CustomViewHolder extends RecyclerView.ViewHolder {

            public TextView textView;
            public ImageView imageView;

            public CustomViewHolder(View view) {
                super(view);
                textView = view.findViewById(R.id.item_project_textView);
                imageView = view.findViewById(R.id.item_project_imageView);
            }
        }
    }
}
