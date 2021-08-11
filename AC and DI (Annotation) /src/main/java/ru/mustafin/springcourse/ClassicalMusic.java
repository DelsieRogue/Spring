package ru.mustafin.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public void playMusic() {
        System.out.println("ClassicalMusic...");
    }
}
