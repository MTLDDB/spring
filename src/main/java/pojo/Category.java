package pojo;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Set;

//@Component
@Entity
@Table(name = "category_")
public class Category {

    private int id;
    private String name;
    Set<ProductH> products;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Column(name="name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
//    public Set<ProductH> getProducts() {
//        return products;
//    }
//    public void setProducts(Set<ProductH> products) {
//        this.products = products;
//    }


}
