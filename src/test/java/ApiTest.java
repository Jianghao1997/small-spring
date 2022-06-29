import com.hoodee.springframework.beans.factory.config.BeanDefinition;
import com.hoodee.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.hoodee.springframework.beans.factory.support.SimpleInstantiationStrategy;
import com.hoodee.springframework.test.bean.UserService;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年06月29日 11:38
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        // 可以指定自己想要的实例方式
        beanFactory.setInstantiationStrategy(new SimpleInstantiationStrategy());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService", "小傅哥");

        userService.queryUserInfo();
    }

    @Test
    public void test_constructor() throws Exception {
        Class<UserService> userServiceClass = UserService.class;
        Constructor<UserService> declaredConstructor = userServiceClass.getDeclaredConstructor(String.class);
        UserService userService = declaredConstructor.newInstance("小傅哥");
        System.out.println(userService);
    }

    @Test
    public void test_parameterTypes() throws Exception {
        Class<UserService> beanClass = UserService.class;
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        Constructor<?> constructor = declaredConstructors[0];
        Constructor<UserService> declaredConstructor = beanClass.getDeclaredConstructor(constructor.getParameterTypes());
        UserService userService = declaredConstructor.newInstance("小傅哥");
        System.out.println(userService);

    }
}
