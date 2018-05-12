package bowonlee.my.queboard.home;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import bowonlee.my.queboard.BoardList.BoardListHolder;
import bowonlee.my.queboard.R;
import bowonlee.my.queboard.models.BaseQuestData;
import bowonlee.my.queboard.models.HomeGallaryData;

public class HomeGallaryAdapter extends RecyclerView.Adapter<HomeGallaryHolder>
{


    private List<HomeGallaryData> datas;
    @NonNull
    @Override
    public HomeGallaryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_main_gallary,parent,false);

        HomeGallaryHolder holder = new HomeGallaryHolder(view);


        return holder;
    }

    public void setDatas(List<HomeGallaryData> datas){

        this.datas = datas;
        notifyDataSetChanged();

    }
    @Override
    public void onBindViewHolder(HomeGallaryHolder holder, int position) {
        holder.setHolder(datas.get(position));
    }

    @Override
    public int getItemCount() {
        Log.e("datasize",datas.size()+"");
        return datas.size();
    }
}
