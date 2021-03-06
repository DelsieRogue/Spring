import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.mustafin.springcourse.MusicPlayer;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);

        context.close();
    }
}
