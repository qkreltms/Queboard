package bowonlee.my.queboard.models;

import java.util.ArrayList;

public class HomeGallaryData extends HomeListData{

    int photoId;

    public HomeGallaryData(int level, String nickname, ArrayList<String> tagList, boolean isChecked) {
        super(level, nickname, tagList, isChecked);
    }
}
