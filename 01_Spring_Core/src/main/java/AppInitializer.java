import bean.MyConnection;
import bean.SpringBean;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        SpringBean springBean1= (SpringBean) context.getBean("test");
        SpringBean springBean2= (SpringBean) context.getBean("test");
        System.out.println(springBean1);
        System.out.println(springBean2);
        MyConnection myConnection1= (MyConnection) context.getBean("ijse");
        MyConnection myConnection2=(MyConnection) context.getBean("ijse");
        System.out.println(myConnection1);
        System.out.println(myConnection2);

        context.registerShutdownHook();
    }
}
