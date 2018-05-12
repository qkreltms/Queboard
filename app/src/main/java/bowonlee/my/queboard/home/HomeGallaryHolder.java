package bowonlee.my.queboard.home;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import bowonlee.my.queboard.R;
import bowonlee.my.queboard.models.HomeGallaryData;

public class HomeGallaryHolder extends RecyclerView.ViewHolder{
    private ImageView mProfileImageView;
    private TextView mLevelTextView;
    private TextView mNicknameTextView;
    private CheckBox mLikeBox;
    private TextView mTagStringTextView;
    private TextView mAmountOfLikeTextView;
    private TextView mAmountOfCommnetTextView;
    private ImageView mPhotoImageView;
    private TextView mOnlineTextView;
    private TextView mRecruitEndTextView;
    private TextView mStartQuestTextView;
    private TextView mEndQuestTextView;

    public HomeGallaryHolder(View itemView) {
        super(itemView);
        mProfileImageView = (ImageView)itemView.findViewById(R.id.viewholder_main_gallary_profile_image);
        mLevelTextView = (TextView)itemView.findViewById(R.id.viewholder_main_gallary_text_level);
        mNicknameTextView = (TextView)itemView.findViewById(R.id.viewholder_main_gallary_nickname);
        mLikeBox = (CheckBox)itemView.findViewById(R.id.viewholder_main_gallary_like);
        mTagStringTextView = (TextView)itemView.findViewById(R.id.viewholder_main_gallary_likenum);
        mAmountOfLikeTextView = (TextView)itemView.findViewById(R.id.viewholder_main_gallary_likenum);
        mAmountOfCommnetTextView = (TextView)itemView.findViewById(R.id.viewholder_main_gallary_commnetnum);
        mPhotoImageView = (ImageView)itemView.findViewById(R.id.viewholder_main_gallary_photo);
        mOnlineTextView = (TextView)itemView.findViewById(R.id.viewholder_main_quest_online);
        mRecruitEndTextView = (TextView)itemView.findViewById(R.id.viewholder_main_quest_recruit);
        mStartQuestTextView = (TextView)itemView.findViewById(R.id.viewholder_main_quest_start_time);
        mEndQuestTextView = (TextView)itemView.findViewById(R.id.viewholder_main_quest_end_time);

    }



    public void setHolder(HomeGallaryData data){
        //mProfileImageView.setImageDrawable();
        mLevelTextView.setText(data.getLevel()+"");
        mNicknameTextView.setText(data.getNickname());
        mLikeBox.setChecked(data.isCheckedLike());
        //mTagStringTextView.setText(data.getTa);
        mAmountOfLikeTextView.setText(data.getAmountOfLike()+"");
        mAmountOfCommnetTextView.setText(data.getAmountOfCommnet()+"");
      //  mPhotoImageView.setImageDrawable(data.getPhotoId());


    }


}
