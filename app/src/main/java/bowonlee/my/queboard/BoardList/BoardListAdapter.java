package bowonlee.my.queboard.BoardList;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import bowonlee.my.queboard.R;
import bowonlee.my.queboard.models.ItemBoardList;

public class BoardListAdapter extends RecyclerView.Adapter<BoardListHolder>{

    private List<ItemBoardList> items;



    public BoardListAdapter(List<ItemBoardList> items){
        this.items = items;

    }
    @NonNull
    @Override
    public BoardListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_board,parent,false);
        BoardListHolder holder = new BoardListHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull BoardListHolder holder, int position) {
        holder.setData(position);


    }

    public void setItem(List<ItemBoardList> items) {
        this.items = items;
        Log.e("items",items.size()+"");
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return (items != null)? items.size():0 ;
    }


}
