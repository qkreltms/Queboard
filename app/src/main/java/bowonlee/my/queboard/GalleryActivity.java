package bowonlee.my.queboard;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

import uk.co.senab.photoview.PhotoViewAttacher;

public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        getWindow().setStatusBarColor(Color.RED);

        RecyclerView recyclerView = findViewById(R.id.galleryActivity_recyclerView);
        recyclerView.setAdapter(new GalleryActivityRecyclerViewAdapter());
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL));

    }

    class GalleryActivityRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        List<Integer> images;

        public GalleryActivityRecyclerViewAdapter() {
            images = new ArrayList<>();

            images.add(R.drawable.drawable_sample);
            images.add(R.drawable.sample_profile_1);
            images.add(R.drawable.sample_profile_2);
            images.add(R.drawable.sample_profile_3);
            images.add(R.drawable.img1);
            images.add(R.drawable.img2);
            images.add(R.drawable.img3);
            images.add(R.drawable.img4);
            images.add(R.drawable.img5);
            images.add(R.drawable.img6);
            images.add(R.drawable.img7);
            images.add(R.drawable.img8);

        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gallery, parent, false);

            return new CustomViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            Glide.with(holder.itemView.getContext())
                    .load(images.get(position))
                    .apply(new RequestOptions().centerCrop())
                    .into(((CustomViewHolder) holder).imageView);

            PhotoViewAttacher photoViewAttacher = new PhotoViewAttacher(((CustomViewHolder) holder).imageView);
            photoViewAttacher.update();
        }

        @Override
        public int getItemCount() {
            return images.size();
        }

        private class CustomViewHolder extends RecyclerView.ViewHolder {

            public ImageView imageView;

            public CustomViewHolder(View view) {
                super(view);
                imageView = view.findViewById(R.id.item_gallery_imageView);
            }
        }
    }
}
