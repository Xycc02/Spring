import com.xuyuchao.pojo.Admin;
import com.xuyuchao.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-25-15:39
 * @Description:
 */
public class AutoWireTest {

    /**
     * 手动装配
     */
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user1");
        user.getCat().shout();
        user.getDog().shout();
    }

    /**
     * byName自动装配
     */
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user2");
        user.getCat().shout();
        user.getDog().shout();
    }

    /**
     * byType自动装配
     */
    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user3");
        user.getCat().shout();
        user.getDog().shout();
    }

    /**
     * 注解方式@AutoWired按类型自动匹配
     * 注解方式@AutoWired按类型自动装配与@Qualifier按名称自动装配连用
     *
     * 注解方式@Resource
     * 如有指定的name属性，先按该属性进行byName方式查找装配；其次再进行默认的byName方式进行装配；
     * 如果以上都不成功，则按byType的方式自动装配。都不成功，则报异常。
     */
    @Test
    public void test4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Admin admin = (Admin) context.getBean("admin");
        admin.getCat().shout();
        admin.getDog().shout();
        admin.getPig().shout();
        admin.getWolf().shout();
    }
}
