package bowonlee.my.queboard.models;

import android.graphics.BitmapFactory;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Date;

public class BaseQuestData {




    int level;
    String nickname;
    ArrayList<String> tagList;
    boolean checkedLike;



    public BaseQuestData(int level, String nickname, ArrayList<String> tagList, boolean isChecked){
        this.level = level;
        this.nickname = nickname;
        this.tagList = tagList;
        this.checkedLike = isChecked;


    }

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
}
