package com.enes;


import com.enes.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // This is the way to get the bean from
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien obj = (Alien) context.getBean("alien");
        System.out.println(obj.getAge());
        obj.code();
    /*
        Computer computer = context.getBean("desktop", Computer.class);
        computer.code();
        Computer computer2 = context.getBean("desktop", Computer.class);
        computer2.code();
*/
/*        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien) context.getBean("alien");
        System.out.println(obj.getAge());
        obj.code();*/
    }
}
