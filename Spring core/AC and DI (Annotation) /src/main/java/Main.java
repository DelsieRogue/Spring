import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.mustafin.springcourse.MusicPlayer;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationSpring.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
    }
}
