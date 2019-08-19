import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.Category;
import service.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class testSpring {
    @Autowired
    Category c;
    @Autowired
    ProductService s;
    @Test
    public void test(){
        System.out.println(c.getName());
        s.doSomeService();
    }
}
