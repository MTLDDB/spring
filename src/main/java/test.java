import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.Category;
import pojo.Product;
import service.ProductService;
public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
//        Category c = context.getBean(Category.class);
//        System.out.println(c.getName());
//        Product p = context.getBean(Product.class);
//
//        System.out.println(p.getName());
//        System.out.println(p.getCategory().getName());

        ProductService s = (ProductService) context.getBean("s");
        s.doSomeService();
    }
}
