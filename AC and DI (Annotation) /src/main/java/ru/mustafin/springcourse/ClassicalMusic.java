package ru.mustafin.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private List<String> nameMusicList = Arrays.asList("Classical1", "Classical2", "Classical3");

    @Override
    public void playMusic(int indexMusic) {
        System.out.println(nameMusicList.get(indexMusic));
    }

}
