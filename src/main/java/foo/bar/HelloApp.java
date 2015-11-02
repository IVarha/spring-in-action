package foo.bar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloService helloService = context.getBean(HelloService.class);
        Performer performer = (Performer) context.getBean("danceDuke");
        performer.perform();
        System.out.println(helloService.sayHello());
        King king = (King) context.getBean("king");
        king.say();
        Performer performer1 = (Performer) context.getBean("kenny");
        performer1.perform();
    }
}
