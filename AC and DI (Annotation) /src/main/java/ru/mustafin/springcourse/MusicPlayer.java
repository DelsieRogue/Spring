package ru.mustafin.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Random;

@Component
public class MusicPlayer {

    @Autowired
    @Qualifier("classicalMusic")
    private Music music1;

    @Autowired
    @Qualifier("jazzMusic")
    private Music music2;


    public void playMusic(TypeMusic typeMusic) {
        Random rand = new Random();
        rand.setSeed(new Date().getTime());
        if (typeMusic == TypeMusic.CLASSICAL){
            music1.playMusic(rand.nextInt(3));
        }
        else {
            music2.playMusic(rand.nextInt(3));
        }
    }
}
