package bowonlee.my.queboard.BoardList;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import bowonlee.my.queboard.R;

public class BoardListHolder extends RecyclerView.ViewHolder {

    TextView textView;
    public BoardListHolder(View itemView) {
        super(itemView);
        textView = (TextView)itemView.findViewById(R.id.testdummydata);


    }
    public void setData(int data){
        textView.setText(data+"dummy");
    }
}
