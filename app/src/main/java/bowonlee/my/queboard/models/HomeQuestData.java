package bowonlee.my.queboard.models;

import java.util.ArrayList;
import java.util.Date;

public class HomeQuestData extends HomeListData{
    String recruitData;
    String questStartDay;
    String questEndDay;
    Boolean isOnline;

    public HomeQuestData(int level, String nickname, ArrayList<String> tagList, boolean isChecked) {
        super(level, nickname, tagList, isChecked);
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
}
