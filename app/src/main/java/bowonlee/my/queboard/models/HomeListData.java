package bowonlee.my.queboard.models;

import java.util.ArrayList;

    public class HomeListData extends BaseQuestData{
        private int amountOfLike;
        private int amountOfCommnet;

        public HomeListData(int level, String nickname, ArrayList<String> tagList, boolean isChecked) {
            super(level, nickname, tagList, isChecked);
        }

        public int getAmountOfCommnet() {
            return amountOfCommnet;
        }

        public int getAmountOfLike(){
            return amountOfLike;
        }

        public void setAmountOfCommnet(int amountOfCommnet) {
            this.amountOfCommnet = amountOfCommnet;
        }

        public void setAmountOfLike(int amountOfLike) {
            this.amountOfLike = amountOfLike;
        }
    }
