import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

        
        Course course = (Course) context.getBean("course");

        
        System.out.println("ID: " + course.getId());
        System.out.println("Name: " + course.getName());
        System.out.println("Description: " + course.getDescription());
        System.out.println("Price: " + course.getPrice());
    }
}
