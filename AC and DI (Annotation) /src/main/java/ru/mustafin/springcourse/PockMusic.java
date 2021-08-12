package ru.mustafin.springcourse;

import org.springframework.stereotype.Component;

@Component
public class PockMusic implements Music{
    private String music;

    @Override
    public void playMusic() {
        System.out.println("Rock");
    }
}
