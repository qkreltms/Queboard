package bowonlee.my.queboard.home;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import bowonlee.my.queboard.models.HomeQuestData;

public class HomeQuestHolder extends RecyclerView.ViewHolder{


     private ImageView mProfileImageView;
     private   TextView mLevelTextView;
     private   TextView mNicknameTextView;
     private   CheckBox mLikeBox;
     private   String mTagString;
     private   int mAmountOfLikeTextView;
     private   int mAmountOfCommnetTextView;
     private   Boolean isOnline;
     private   String mRecruitEndTextView;
    private   String mStartQuestTextView;
    private   String mEndQuestTextView;



    public HomeQuestHolder(View itemView) {
        super(itemView);
    }


    public void setHolder(HomeQuestData data){

    }
}
