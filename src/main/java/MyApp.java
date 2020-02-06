import com.lunarshade.springdemo.xml.coach.Coach;
import com.lunarshade.springdemo.xml.coach.JavaCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Coach myCoach = applicationContext.getBean("javaCoach", JavaCoach.class);
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());

        applicationContext.close();
    }
}
