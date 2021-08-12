import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.mustafin.springcourse.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Configuration
public class ConfigurationSpring {

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public PockMusic pockMusic(){
        return new PockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(listMusic());
    }

    @Bean
    public List<Music> listMusic(){
        return Arrays.asList(pockMusic(), jazzMusic(), classicalMusic());
    }
}
