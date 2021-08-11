import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.mustafin.springcourse.ClassicalMusic;
import ru.mustafin.springcourse.Music;
import ru.mustafin.springcourse.MusicPlayer;
import ru.mustafin.springcourse.TypeMusic;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(TypeMusic.ROCK);
        context.close();
    }
}
