package ua.java_training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        User user = context.getBean("user", User.class);
//        System.out.println(user.getFirstName());
//        System.out.println(user.getLastName());
//        System.out.println(user.getAge());

        user.sayHello();

        context.close();
    }
}
