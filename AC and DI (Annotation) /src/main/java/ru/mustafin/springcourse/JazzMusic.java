package ru.mustafin.springcourse;


import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music{

    @Override
    public void playMusic() {
        System.out.println("JazzMusic....");
    }
}
