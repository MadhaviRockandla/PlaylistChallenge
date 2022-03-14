package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        int i =startIndex;
        int countUp=0;
        int countDown=0;
        while (playList[i]!=selection){
            i++;
            countUp++;
            if(i == playList.length)
            {
                i=0;
            }
        }
        i=startIndex;
        while (playList[i]!=selection){
            i--;
            countDown++;
            if(i == -1){i=playList.length-1;}
        }

        if(countDown < countUp){
            return countDown;
        } else return countUp;
    }
}

