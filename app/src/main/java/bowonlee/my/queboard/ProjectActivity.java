package bowonlee.my.queboard;

import android.net.Uri;
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

import bowonlee.my.queboard.models.projectModel;

public class ProjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        ArrayList<projectModel> quests = new ArrayList<>();
        quests.add(new projectModel("test", R.drawable.people));
        quests.add(new projectModel("test", R.drawable.people));
        quests.add(new projectModel("test", R.drawable.people));
        quests.add(new projectModel("test", R.drawable.people));
        quests.add(new projectModel("test", R.drawable.people));
        quests.add(new projectModel("test", R.drawable.people));
        quests.add(new projectModel("test", R.drawable.people));
        quests.add(new projectModel("test", R.drawable.people));
        quests.add(new projectModel("test", R.drawable.people));

        RecyclerView recyclerView = findViewById(R.id.projectActivity_recyclerView_onGoingQues);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ProjectActivityRecyclerViewAdapter(quests));
        recyclerView.setHasFixedSize(true);

        ArrayList<projectModel> quests1 = new ArrayList<>();
        quests1.add(new projectModel("test", R.drawable.mail));
        quests1.add(new projectModel("test", R.drawable.mail));
        quests1.add(new projectModel("test", R.drawable.mail));
        quests1.add(new projectModel("test", R.drawable.mail));
        quests1.add(new projectModel("test", R.drawable.mail));
        quests1.add(new projectModel("test", R.drawable.mail));
        quests1.add(new projectModel("test", R.drawable.mail));
        quests1.add(new projectModel("test", R.drawable.mail));
        quests1.add(new projectModel("test", R.drawable.mail));


        RecyclerView recyclerView1 = findViewById(R.id.projectActivity_recyclerView_completedQues);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        recyclerView1.setAdapter(new ProjectActivityRecyclerViewAdapter1(quests1));
        recyclerView1.setHasFixedSize(true);

    }

    class ProjectActivityRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        List<projectModel> quests;

        public ProjectActivityRecyclerViewAdapter(ArrayList<projectModel> arrayList) {
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

            Glide.with(holder.itemView.getContext())
                    .load(quests.get(position).pictureUrl)
                    .apply(new RequestOptions().centerCrop())
                    .into(((CustomViewHolder)holder).imageView);
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

        List<projectModel> quests;

        public ProjectActivityRecyclerViewAdapter1(ArrayList<projectModel> arrayList) {
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

            Glide.with(holder.itemView.getContext())
                    .load(quests.get(position).pictureUrl)
                    .apply(new RequestOptions().centerCrop())
                    .into(((CustomViewHolder)holder).imageView);
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
