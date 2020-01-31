import com.lunarshade.springdemo.BaseballCoach;
import com.lunarshade.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach baseballCoach = applicationContext.getBean("myCoach", Coach.class);
        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(baseballCoach.getDailyFortune());

        applicationContext.close();
    }
}
