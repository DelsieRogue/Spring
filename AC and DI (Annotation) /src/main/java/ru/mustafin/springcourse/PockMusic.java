package ru.mustafin.springcourse;

import org.springframework.stereotype.Component;

@Component
public class PockMusic implements Music{
    @Override
    public void playMusic(int indexMusic) {
        System.out.println("RockMusic...");
    }
}
