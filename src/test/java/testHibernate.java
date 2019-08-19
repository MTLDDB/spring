import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import pojo.Category;
import pojo.Product;
import pojo.ProductH;
import pojo.User;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class testHibernate {
        public static void main(String[] args) {

            SessionFactory sf = new Configuration().configure(new File("src/hibernate.cfg.xml")).buildSessionFactory();

            Session s = sf.openSession();
            s.beginTransaction();//开始事务

//            ProductH p = new ProductH();
//            p.setName("iphone7");
//            p.setPrice(7000);
//            s.save(p);
//            for (int i = 0; i < 10; i++) {
//                ProductH p = new ProductH();
//                p.setName("iphone"+i);
//                p.setPrice(i);
//                s.save(p);
//            }
           // ProductH p =(ProductH) s.get(ProductH.class, 7);
//            String name = "iphone";
//            String sql = "select * from product p where p.name like '%"+name+"%'";//SQL语句查询
//            Query q= s.createSQLQuery(sql);
//            List<Object[]> list= q.list();
//            for (Object[] os : list) {
//                for (Object filed: os) {
//                    System.out.print(filed+"\t");
//                }
//                System.out.println();
//            }
//           // Criteria c= s.createCriteria(ProductH.class);//通过session的createCriteria创建一个Criteria 对象
            //c.add(Restrictions.like("name", "%"+name+"%"));// Criteria.add 增加约束。 在本例中增加一个对name的模糊查询(like)
           // c.add(Restrictions.naturalId());

            //c.setFirstResult(7);//第八条开始
           // c.setMaxResults(4);//四条数据
//            List<ProductH> ps = c.list();
//            for (ProductH p : ps) {
//                System.out.println(p.getName());
//            }
//            Query q =s.createQuery("from ProductH  where name like ?");//HQL语句查询
//            q.setString(0, "%"+name+"%");
//            List<ProductH> ps= q.list();
//            for (ProductH p : ps) {
//                System.out.println(p.getName());
//            }
//            System.out.println(p.getName());
//            p.setName("iphone-modified");
//
//            s.update(p);//更新
//            System.out.println("id=6的产品名称是: "+p.getName());
            //s.delete(p);//删除，

//            Category c =new Category();//多对一
//            c.setName("c1");
//            s.save(c);
//            //s.delete(c);
//            ProductH p = (ProductH) s.get(ProductH.class, 8);
//            p.setCategory(c);
//            s.update(p);

//            Category c = (Category) s.get(Category.class, 1);//一对多
//            Set<ProductH> ps = c.getProducts();
//            for (ProductH p : ps) {
//                System.out.println(p.getName());
//            }
//            Set<User> users = new HashSet();//多对多
//            for (int i = 0; i < 3; i++) {
//                User u =new User();
//                u.setName("user"+i);
//                users.add(u);
//                s.save(u);
//                s.clear();
//            }
//            //产品1被用户1,2,3购买
//            ProductH p1 = (ProductH) s.get(ProductH.class, 1);//
//
//            p1.setUsers(users);
//            s.save(p1);


//            ProductH p = (ProductH)s.load(ProductH.class, 1);//延迟加载
//            System.out.println("log1");
//            System.out.println(p.getName());
//            System.out.println("log2");

//            Category c = (Category) s.get(Category.class, 1);//懒加载,用到时在加载
//
//            System.out.println("log1");
//            System.out.println(c.getProducts());
//            System.out.println("log1");
//            s.getTransaction().commit();//提交事务
//            s.close();


//            Session s1 = sf.openSession();
//            Session s2 = sf.openSession();
//
//            s1.beginTransaction();
//            s2.beginTransaction();
//
//            ProductH p1 = (ProductH) s1.get(ProductH.class, 1);
//            System.out.println("产品原本价格是: " + p1.getPrice());
//
//            p1.setPrice(p1.getPrice() + 1000);
//
//            ProductH p2 = (ProductH) s2.get(ProductH.class, 1);
//            p2.setPrice(p2.getPrice() + 1000);
//
//            s1.update(p1);
//            s2.update(p2);
//
//            s1.getTransaction().commit();
//            s2.getTransaction().commit();
//
//            ProductH p = (ProductH) s1.get(ProductH.class, 1);
//
//            System.out.println("经过两次价格增加后，价格变为: " + p.getPrice());
//
//            s1.close();
//            s2.close();
//            s.createQuery("from Category").list();
////            s.createQuery("from Category").list();
////            s.createQuery("from Category").list();
////            s.createQuery("from Category").list();
////            s.createQuery("from Category").list();
////            s.createQuery("from Product").list();
            Category category=new Category();
            category.setName("c2");
            s.save(category);
            Product product=(Product) s.get(Product.class,1);
            product.setCategory(category);
            s.save(product);
            s.getTransaction().commit();
            s.close();
            sf.close();
        }
}
