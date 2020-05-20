package run;
import dao.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Run {
    public static void main(String[] args) {
//        // 读取配置文件，初始化IOC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Test test = applicationContext.getBean(Test.class);
        // or 强转
//        Test test = (Test) applicationContext.getBean("test");

        test.getName();

    }

}
