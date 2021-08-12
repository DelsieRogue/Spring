package ru.mustafin.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    List<Music> musics = new LinkedList<>();

    public MusicPlayer(List<Music> musics) {
        this.musics = musics;
    }

    public void playMusic(){
        Random rand = new Random();
        rand.setSeed(new Date().getTime());
        musics.get(rand.nextInt(3)).playMusic();
    }

}
