package bowonlee.my.queboard.home;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import bowonlee.my.queboard.models.HomeQuestData;

public class HomeQuestHolder extends RecyclerView.ViewHolder {

    private ImageView mProfileImageView;
    private TextView mLevelTextView;
    private TextView mNicknameTextView;
    private CheckBox mLikeBox;
    private TextView mTagStringTextView;
    private TextView mAmountOfLikeTextView;
    private TextView mAmountOfCommnetTextView;
    private CheckBox mOnlineCheckBox;
    private TextView mRecruitEndTextView;
    private TextView mStartQuestTextView;
    private TextView mEndQuestTextView;


    public HomeQuestHolder(View itemView) {
        super(itemView);
    }


    public void setHolder(HomeQuestData data) {
        //mProfileImageView.setImageDrawable();
        mLevelTextView.setText(data.getLevel());
        mNicknameTextView.setText(data.getNickname());
        mLikeBox.setChecked(data.isCheckedLike());
        //mTagStringTextView.setText(data.getTagList());
        mAmountOfLikeTextView.setText(data.getAmountOfLike());
        mAmountOfCommnetTextView.setText(data.getAmountOfCommnet());
        mOnlineCheckBox.setChecked(data.getOnline());

        mRecruitEndTextView.setText(data.getRecruitData());
        mStartQuestTextView.setText(data.getQuestStartDay());
        mEndQuestTextView.setText(data.getQuestEndDay());

    }
}
