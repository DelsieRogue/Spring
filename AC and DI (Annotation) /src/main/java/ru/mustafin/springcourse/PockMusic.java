package ru.mustafin.springcourse;

import org.springframework.stereotype.Component;

@Component
public class PockMusic implements Music{
    @Override
    public void playMusic() {
        System.out.println("RockMusic...");
    }
}
