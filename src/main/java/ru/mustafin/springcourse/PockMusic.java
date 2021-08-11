package ru.mustafin.springcourse;

public class PockMusic implements Music{
    @Override
    public void playMusic() {
        System.out.println("RockMusic...");
    }
}
