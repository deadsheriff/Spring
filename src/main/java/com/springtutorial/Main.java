package com.springtutorial;

import com.springtutorial.springidol.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
        Performer performer = (Performer) ctx.getBean("poeticDuke");
        performer.Perform();
        performer = (Performer) ctx.getBean("kenny");
        performer.Perform();
        performer = (Performer) ctx.getBean("carl");
        performer.Perform();
    }
}
