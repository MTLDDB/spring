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
    Set<Product> products;
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
    @OneToMany(fetch=FetchType.EAGER)//,fetch=FetchType.EAGER 表示不进行延迟加载(FetchType.LAZY表示要进行延迟加载)
    @JoinColumn(name="cid")
    public Set<Product> getProducts() {
        return products;
    }
    public void setProducts(Set<Product> products) {
        this.products = products;
    }


}
