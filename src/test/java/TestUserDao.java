import com.pengshiyu.bean.User;
import com.pengshiyu.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestUserDao {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao = (UserDao)context.getBean("userDao");
        List<User> list = userDao.getAll();
        System.out.println(list.size());
    }
}
