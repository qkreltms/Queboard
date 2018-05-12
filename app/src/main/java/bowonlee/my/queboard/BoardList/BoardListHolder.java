package bowonlee.my.queboard.BoardList;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import bowonlee.my.queboard.R;
import bowonlee.my.queboard.models.BaseQuestData;

public class BoardListHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private ImageView mImageView;
    private TextView mLevelTextView;
    private TextView mTagTextView;
    private CheckBox mLikeBox;
    private TextView mNameTextView;

    private String tagString;

    private BaseQuestData mItemBoardList ;

    @Override
    public void onClick(View view) {

    }

    interface OnBoarderItemClickListener{
         void onHolderItemClick(BaseQuestData data);
    }


    OnBoarderItemClickListener listener;

    public BoardListHolder(View itemView) {
        super(itemView);

        mImageView = (ImageView)itemView.findViewById(R.id.viewholder_image);
        mLevelTextView = (TextView)itemView.findViewById(R.id.viewholder_text_level);
        mTagTextView = (TextView)itemView.findViewById(R.id.viewholder_tag);
        mLikeBox = (CheckBox)itemView.findViewById(R.id.viewholder_check_like);
        mNameTextView = (TextView)itemView.findViewById(R.id.viewholder_text_nickname);


        itemView.setOnClickListener(this);
    }

    public void setItems(BaseQuestData item){
            this.mItemBoardList = item;

            mLevelTextView.setText(String.format("Lv. %d",mItemBoardList.getLevel())) ;
            mLikeBox.setChecked(mItemBoardList.isCheckedLike());
            mNameTextView.setText(mItemBoardList.getNickname());

        for(int i = 1;i<mItemBoardList.getTagList().size();i++){
            tagString += "#"+mItemBoardList.getTagList().get(i) + " ";
        }
            mTagTextView.setText(tagString);

    }

    public void setOnClickListener(OnBoarderItemClickListener listener){
        this.listener = listener;
    }
}
