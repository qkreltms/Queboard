package bowonlee.my.queboard.home;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import bowonlee.my.queboard.R;
import bowonlee.my.queboard.models.HomeQuestData;

public class HomeQuestHolder extends RecyclerView.ViewHolder {



    private ImageView mProfileImageView;
    private TextView mLevelTextView;
    private TextView mNicknameTextView;
    private CheckBox mLikeBox;
    private TextView mTagStringTextView;
    private TextView mAmountOfLikeTextView;
    private TextView mAmountOfCommnetTextView;
    private TextView mOnlineTextView;
    private TextView mRecruitEndTextView;
    private TextView mStartQuestTextView;
    private TextView mEndQuestTextView;


    public HomeQuestHolder(View itemView) {
        super(itemView);

        mProfileImageView = (ImageView)itemView.findViewById(R.id.viewholder_main_quest_profileimage);
        mLevelTextView = (TextView)itemView.findViewById(R.id.viewholder_main_quest_level);
        mNicknameTextView = (TextView)itemView.findViewById(R.id.viewholder_main_quest_nickname);
        mLikeBox = (CheckBox)itemView.findViewById(R.id.viewholder_main_quest_like);
        mTagStringTextView = (TextView)itemView.findViewById(R.id.viewholder_main_quest_tag);
        mAmountOfLikeTextView = (TextView)itemView.findViewById(R.id.viewholder_main_quest_check_likesum);
        mAmountOfCommnetTextView = (TextView)itemView.findViewById(R.id.viewholder_main_quest_comment_sum);
        mOnlineTextView = (TextView)itemView.findViewById(R.id.viewholder_main_quest_online);
        mRecruitEndTextView = (TextView)itemView.findViewById(R.id.viewholder_main_quest_recruit);
        mStartQuestTextView = (TextView)itemView.findViewById(R.id.viewholder_main_quest_start_time);
        mEndQuestTextView = (TextView)itemView.findViewById(R.id.viewholder_main_quest_end_time);



    }


    public void setHolder(HomeQuestData data) {
        //mProfileImageView.setImageDrawable();
        mLevelTextView.setText(data.getLevel());
        mNicknameTextView.setText(data.getNickname());
        mLikeBox.setChecked(data.isCheckedLike());
        //mTagStringTextView.setText(data.getTagList());
        mAmountOfLikeTextView.setText(data.getAmountOfLike());
        mAmountOfCommnetTextView.setText(data.getAmountOfCommnet());

        mOnlineTextView.setText("Online");
        mRecruitEndTextView.setText(data.getRecruitData());
        mStartQuestTextView.setText(data.getQuestStartDay());
        mEndQuestTextView.setText(data.getQuestEndDay());

    }
}
