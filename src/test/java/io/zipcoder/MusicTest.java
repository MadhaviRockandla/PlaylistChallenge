package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class MusicTest {

    @Test
    public void selectionTest1(){

        String[] playlist = {"song1","song2","song3","song4"};
        Music music = new Music(playlist);
        Integer startingIndex = 1;
        String selection = "song4";
        Integer expected = 2;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectionTest2(){

        String[] playlist = {"song5","song6","song7","song8"};
        Music music = new Music(playlist);
        Integer startingIndex = 0;
        String selection = "song8";
        Integer expected = 1;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }
}
