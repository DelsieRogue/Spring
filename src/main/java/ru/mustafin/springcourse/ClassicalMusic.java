package ru.mustafin.springcourse;

public class ClassicalMusic implements Music{
    @Override
    public void playMusic() {
        System.out.println("ClassicalMusic...");
    }
}
