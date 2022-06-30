import com.hoodee.springframework.beans.PropertyValue;
import com.hoodee.springframework.beans.PropertyValues;
import com.hoodee.springframework.beans.factory.config.BeanDefinition;
import com.hoodee.springframework.beans.factory.config.BeanReference;
import com.hoodee.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.hoodee.springframework.test.bean.UserDao;
import com.hoodee.springframework.test.bean.UserService;
import org.junit.Test;

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

        // 2. UserDao 注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // 3. UserService 设置属性[name、userDao]
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));

        // 4. UserService 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 5. UserService 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
