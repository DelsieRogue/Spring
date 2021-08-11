package ru.mustafin.springcourse;


import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class JazzMusic implements Music{
    private List<String> nameMusicList = Arrays.asList("JazzMusic1", "JazzMusic2", "JazzMusic3");

    @Override
    public void playMusic(int indexMusic) {
        System.out.println(nameMusicList.get(indexMusic));
    }
}
