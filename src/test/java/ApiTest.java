import com.hoodee.springframework.beans.factory.config.BeanDefinition;
import com.hoodee.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.hoodee.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年06月29日 11:38
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //3.第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();

        System.out.println(userService == userService_singleton);
    }
}
