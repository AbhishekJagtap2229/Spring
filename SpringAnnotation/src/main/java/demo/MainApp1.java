package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
        Sports s1=c1.getBean("sport1", Sports.class);
        s1.getName();
        s1.getType();

        Sports s2=c1.getBean("sport2", Sports.class);
        s2.getName();
        s2.getType();

        Sports s3=c1.getBean("cricket", Sports.class);
        s3.getName();
        s3.getType();
    }
}
