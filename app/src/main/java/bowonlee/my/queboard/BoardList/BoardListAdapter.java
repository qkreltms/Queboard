package bowonlee.my.queboard.BoardList;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import bowonlee.my.queboard.BulletinActivity;
import bowonlee.my.queboard.R;
import bowonlee.my.queboard.models.BaseQuestData;

public class BoardListAdapter extends RecyclerView.Adapter<BoardListHolder>
        implements BoardListHolder.OnBoarderItemClickListener{

    private List<BaseQuestData> items;

    BoardListAdapter(){

    }

    @NonNull
    @Override
    public BoardListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_board,parent,false);
        BoardListHolder holder = new BoardListHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(BoardListHolder holder, int position) {
        holder.setItems(items.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), BulletinActivity.class);
                v.getContext().startActivity(intent);
            }
        });

        Glide.with(holder.itemView.getContext())
                .load(R.drawable.drawable_sample)
                .apply(new RequestOptions().circleCrop())
                .into(holder.mImageView);
    }



    public void setItem(List<BaseQuestData> items) {
        this.items = items;
        Log.e("items",items.size()+"");
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return (items != null)? items.size():0 ;
    }


    @Override
    public void onHolderItemClick(BaseQuestData data) {
        // ClickEvent
    }
}
