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
        messages.add(new AlarmModel("test", R.drawable.people));
        messages.add(new AlarmModel("test", R.drawable.people));
        messages.add(new AlarmModel("test", R.drawable.people));
        messages.add(new AlarmModel("test", R.drawable.people));
        messages.add(new AlarmModel("test", R.drawable.people));
        messages.add(new AlarmModel("test", R.drawable.people));
        messages.add(new AlarmModel("test", R.drawable.people));
        messages.add(new AlarmModel("test", R.drawable.people));
        messages.add(new AlarmModel("test", R.drawable.people));
        messages.add(new AlarmModel("test", R.drawable.people));
        messages.add(new AlarmModel("test", R.drawable.people));
        messages.add(new AlarmModel("test", R.drawable.people));
        messages.add(new AlarmModel("test", R.drawable.people));
        messages.add(new AlarmModel("test", R.drawable.people));
        messages.add(new AlarmModel("test", R.drawable.people));
        messages.add(new AlarmModel("test", R.drawable.people));

        final RecyclerView recyclerView = view.findViewById(R.id.fragment_alarm_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new AlarmActivityRecyclerViewAdapter(messages));
        recyclerView.setHasFixedSize(true);

        ArrayList<AlarmModel> messages1 = new ArrayList<>();
        messages1.add(new AlarmModel("test", R.drawable.mail));
        messages1.add(new AlarmModel("test", R.drawable.mail));
        messages1.add(new AlarmModel("test", R.drawable.mail));
        messages1.add(new AlarmModel("test", R.drawable.mail));
        messages1.add(new AlarmModel("test", R.drawable.mail));
        messages1.add(new AlarmModel("test", R.drawable.mail));
        messages1.add(new AlarmModel("test", R.drawable.mail));
        messages1.add(new AlarmModel("test", R.drawable.mail));
        messages1.add(new AlarmModel("test", R.drawable.mail));
        messages1.add(new AlarmModel("test", R.drawable.mail));
        messages1.add(new AlarmModel("test", R.drawable.mail));
        messages1.add(new AlarmModel("test", R.drawable.mail));
        messages1.add(new AlarmModel("test", R.drawable.mail));
        messages1.add(new AlarmModel("test", R.drawable.mail));
        messages1.add(new AlarmModel("test", R.drawable.mail));
        messages1.add(new AlarmModel("test", R.drawable.mail));

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
