package ru.mustafin.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private String music;
    @Override
    public void playMusic() {
        System.out.println("Classical");
    }

}
