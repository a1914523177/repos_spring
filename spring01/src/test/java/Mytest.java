import com.huike.dao.UserDaoMysqlImpl;
import com.huike.dao.UserDaoSqlServiceImpl;
import com.huike.service.UserService;
import com.huike.service.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {

    public static void main(String[] args) {
        //获取applicationContext
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //拿到容器，想要什么拿什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

        userServiceImpl.getUser();
    }
}
