import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld helloWorld1 = applicationContext.getBean(HelloWorld.class);
        HelloWorld helloWorld2 = applicationContext.getBean(HelloWorld.class);

        Cat cat1 = applicationContext.getBean(Cat.class);
        Cat cat2 = applicationContext.getBean(Cat.class);

        boolean isHelloWorldSame = (helloWorld1 == helloWorld2);
        boolean isCatSame = (cat1 == cat2);

        System.out.println("равны ли коты? " + isCatSame);
        System.out.println("равны ди привет мир? " + isHelloWorldSame);
    }

}
