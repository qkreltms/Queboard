package bowonlee.my.queboard.home;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import bowonlee.my.queboard.R;
import bowonlee.my.queboard.models.HomeGallaryData;

public class HomeGallaryHolder extends RecyclerView.ViewHolder {
    public ImageView mProfileImageView;
    private TextView mLevelTextView;
    private TextView mNicknameTextView;
    private CheckBox mLikeBox;
    private TextView mTagStringTextView;
    private TextView mAmountOfLikeTextView;
    private TextView mAmountOfCommnetTextView;
    public ImageView mPhotoImageView;
    private TextView mOnlineTextView;
    private TextView mRecruitEndTextView;
    private TextView mStartQuestTextView;
    private TextView mEndQuestTextView;

    public HomeGallaryHolder(View itemView) {
        super(itemView);
        mProfileImageView = (ImageView) itemView.findViewById(R.id.viewholder_main_gallary_profile_image);
        mLevelTextView = (TextView) itemView.findViewById(R.id.viewholder_main_gallary_text_level);
        mNicknameTextView = (TextView) itemView.findViewById(R.id.viewholder_main_gallary_nickname);
        mLikeBox = (CheckBox) itemView.findViewById(R.id.viewholder_main_gallary_like);
        mTagStringTextView = (TextView) itemView.findViewById(R.id.viewholder_main_gallary_tag);
        mAmountOfLikeTextView = (TextView) itemView.findViewById(R.id.viewholder_main_gallary_likenum);
        mAmountOfCommnetTextView = (TextView) itemView.findViewById(R.id.viewholder_main_gallary_commnetnum);
        mPhotoImageView = (ImageView) itemView.findViewById(R.id.viewholder_main_gallary_photo);
        mOnlineTextView = (TextView) itemView.findViewById(R.id.viewholder_main_quest_online);
        mRecruitEndTextView = (TextView) itemView.findViewById(R.id.viewholder_main_quest_recruit);
        mStartQuestTextView = (TextView) itemView.findViewById(R.id.viewholder_main_quest_start_time);
        mEndQuestTextView = (TextView) itemView.findViewById(R.id.viewholder_main_quest_end_time);

    }


    public void setHolder(HomeGallaryData data) {
        mProfileImageView.setImageResource(data.getProfilePhotoId());
        mLevelTextView.setText(data.getLevel() + "");
        mNicknameTextView.setText(data.getNickname());
        mLikeBox.setChecked(data.isCheckedLike());
        ;
        mAmountOfLikeTextView.setText(data.getAmountOfLike() + "");
        mAmountOfCommnetTextView.setText(data.getAmountOfCommnet() + "");

        if(data.getRecruitData() != null){
        setQuestItems(data);
        } else{
            setGallaryItems(data);
            mPhotoImageView.setImageResource(data.getPhotoId());

        }

        String tagString = "";
        for(int i = 1;i<data.getTagList().size();i++){
            tagString += data.getTagList().get(i) + " ";
        }
        mTagStringTextView.setText(tagString);
    }

    public void setGallaryItems(HomeGallaryData data){


    }
    public void setQuestItems(HomeGallaryData data){



        mRecruitEndTextView.setText(        String.format("모집기간 : %s",data.getRecruitData()));
        mStartQuestTextView.setText(        String.format("시작날자 : %s",data.getQuestStartDay()));
        mEndQuestTextView.setText(        String.format("완료기한 : %s",data.getQuestEndDay()));


    }


}
