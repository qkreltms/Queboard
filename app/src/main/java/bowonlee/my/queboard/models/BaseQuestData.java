package bowonlee.my.queboard.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Date;

public class BaseQuestData implements Parcelable{

    protected int level;
    protected String nickname;
    protected ArrayList<String> tagList;
    protected boolean checkedLike;
    protected String questStartDay;
    protected String questEndDay;
    protected String recruitData;
    protected int photoId;
    protected int profilePhotoId;

    Boolean isOnline;

    public BaseQuestData(){
    }

    public BaseQuestData(int level, String nickname, ArrayList<String> tagList, boolean isChecked){
        this.level = level;
        this.nickname = nickname;
        this.tagList = tagList;
        this.checkedLike = isChecked;
    }

    protected BaseQuestData(Parcel in) {
        level = in.readInt();
        nickname = in.readString();
        tagList = in.createStringArrayList();
        checkedLike = in.readByte() != 0;
        questStartDay = in.readString();
        questEndDay = in.readString();
        recruitData = in.readString();
        photoId = in.readInt();
        byte tmpIsOnline = in.readByte();
        isOnline = tmpIsOnline == 0 ? null : tmpIsOnline == 1;
    }

    public static final Creator<BaseQuestData> CREATOR = new Creator<BaseQuestData>() {
        @Override
        public BaseQuestData createFromParcel(Parcel in) {
            return new BaseQuestData(in);
        }

        @Override
        public BaseQuestData[] newArray(int size) {
            return new BaseQuestData[size];
        }
    };

    public ArrayList<String> getTagList() {
        return tagList;
    }

    public void setTagList(ArrayList<String> tagList) {
        this.tagList = tagList;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setCheckedLike(boolean checkedLike) {
        this.checkedLike = checkedLike;
    }

    public boolean isCheckedLike() {
        return checkedLike;
    }

    public String getRecruitData() {
        return recruitData;
    }

    public String getQuestStartDay() {
        return questStartDay;
    }

    public String getQuestEndDay() {
        return questEndDay;
    }

    public Boolean getOnline() {
        return isOnline;
    }

    public void setProfilePhotoId(int profilePhotoId) {
        this.profilePhotoId = profilePhotoId;
    }

    public int getProfilePhotoId() {
        return profilePhotoId;
    }

    public void setRecruitData(String recruitData) {
        this.recruitData = recruitData;
    }


    public void setQuestStartDay(String questStartDay) {
        this.questStartDay = questStartDay;
    }

    public void setQuestEndDay(String questEndDay) {
        this.questEndDay = questEndDay;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {


        parcel.writeInt(level);
        parcel.writeString(nickname);
        parcel.writeStringList(tagList);
        parcel.writeByte((byte) (checkedLike ? 1 : 0));
        parcel.writeString(questStartDay);
        parcel.writeString(questEndDay);
        parcel.writeString(recruitData);
        parcel.writeInt(photoId);
        parcel.writeByte((byte) (isOnline == null ? 0 : isOnline ? 1 : 2));
    }
}
