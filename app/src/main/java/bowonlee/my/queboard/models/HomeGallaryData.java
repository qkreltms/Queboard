package bowonlee.my.queboard.models;

import java.util.ArrayList;

public class HomeGallaryData extends HomeListData{


    public HomeGallaryData(int level, String nickname, ArrayList<String> tagList, boolean isChecked) {
        super(level, nickname, tagList, isChecked);
    }

    public HomeGallaryData(){
        super();
    }


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
        setTagList(tags);
        setCheckedLike(liked);
        setAmountOfLike(likeSum);
        setAmountOfCommnet(commnetSum);
        setPhotoId(photoId);

        return this;
    }




}
