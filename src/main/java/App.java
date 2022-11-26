import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanTwo = (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanCatOne = (Cat) applicationContext.getBean("cat", Cat.class);
        Cat beanCatTwo = (Cat) applicationContext.getBean("cat", Cat.class);

        System.out.println(bean == beanTwo);
        System.out.println(beanCatOne == beanCatTwo);
    }
}