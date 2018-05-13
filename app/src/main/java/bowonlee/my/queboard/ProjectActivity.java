package bowonlee.my.queboard;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

import bowonlee.my.queboard.models.ProjectModel;

public class ProjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
        getWindow().setStatusBarColor(Color.RED);

        ArrayList<ProjectModel> quests = new ArrayList<>();
        quests.add(new ProjectModel("#수원 #아주대 #헬스 #저녁 7시 #파트너"));
        quests.add(new ProjectModel("#스타트업 #웨이트 트레이닝 #아주대 #오후 7시 #운동 #수원"));
        quests.add(new ProjectModel("#강한친구 #군대 #말년에 #유격이라니 #나는간부 #중대장 #실망"));
        quests.add(new ProjectModel("#스타트업 #무박3일 #정신혼미"));


        RecyclerView recyclerView = findViewById(R.id.projectActivity_recyclerView_onGoingQues);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new AlarmActivityRecyclerViewAdapter(quests));
        recyclerView.setHasFixedSize(true);

        ArrayList<ProjectModel> quests1 = new ArrayList<>();
        quests1.add(new ProjectModel("#수원 #아주대 #헬스 #저녁 6시 #파트너"));
        quests1.add(new ProjectModel("#수원 #농구 #슬램덩크 #8시 #운동 #아주대"));
        quests1.add(new ProjectModel("#찜질방 #게르마늄 #황토사우나 #식혜 #김밥 #얼음사우나 #무릉도원"));
        quests1.add(new ProjectModel("#수원 #아주대 #웨이트 트레이닝 #저녁 7시 #파트너"));
        quests1.add(new ProjectModel("#이천 #7군단 #사령부 #오늘도 #깊은실망"));
        quests1.add(new ProjectModel("#이천 #축구 #선착순 #저녁 7시 #연병장"));



        RecyclerView recyclerView1 = findViewById(R.id.projectActivity_recyclerView_completedQues);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        recyclerView1.setAdapter(new ProjectActivityRecyclerViewAdapter1(quests1));
        recyclerView1.setHasFixedSize(true);

    }

    class AlarmActivityRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        List<ProjectModel> quests;

        public AlarmActivityRecyclerViewAdapter(ArrayList<ProjectModel> arrayList) {
            quests = arrayList;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);

            return new CustomViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            ((CustomViewHolder) holder).textView.setText(quests.get(position).title);

             ((CustomViewHolder) holder).imageView.setVisibility(View.GONE);
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

    class ProjectActivityRecyclerViewAdapter1 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        List<ProjectModel> quests;

        public ProjectActivityRecyclerViewAdapter1(ArrayList<ProjectModel> arrayList) {
            quests = arrayList;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);

            return new CustomViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            ((CustomViewHolder) holder).textView.setText(quests.get(position).title);

            ((CustomViewHolder) holder).imageView.setVisibility(View.GONE);
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
