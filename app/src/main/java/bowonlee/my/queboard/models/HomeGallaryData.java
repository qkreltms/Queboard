package bowonlee.my.queboard.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class HomeGallaryData extends HomeListData implements Parcelable{


    public HomeGallaryData(int level, String nickname, ArrayList<String> tagList, boolean isChecked) {
        super(level, nickname, tagList, isChecked);
    }

    public HomeGallaryData(){
        super();
    }


    protected HomeGallaryData(Parcel in) {
    }

    public static final Creator<HomeGallaryData> CREATOR = new Creator<HomeGallaryData>() {
        @Override
        public HomeGallaryData createFromParcel(Parcel in) {
            return new HomeGallaryData(in);
        }

        @Override
        public HomeGallaryData[] newArray(int size) {
            return new HomeGallaryData[size];
        }
    };

    public HomeGallaryData setQuestData(int profile, int level, String name, ArrayList<String> tags, boolean liked, boolean online, int likeSum, int commentSum, String recruit, String start, String end){

        setProfilePhotoId(profile);
        setLevel(level);
        setNickname(name);
        setTagList(tags);
        setCheckedLike(liked);
        setAmountOfLike(likeSum);
        setAmountOfCommnet(commentSum);
        setRecruitData(recruit);
        setQuestStartDay(start);
        setQuestEndDay(end);

        return this;
    }
    public HomeGallaryData setGallaryData(int profile, int level, String name, ArrayList<String> tags, boolean liked, int likeSum, int commnetSum, int photoId){
        setProfilePhotoId(profile);
        setLevel(level);
        setNickname(name);
        setTagList(tags);
        setCheckedLike(liked);
        setAmountOfLike(likeSum);
        setAmountOfCommnet(commnetSum);
        setPhotoId(photoId);

        return this;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }
}
