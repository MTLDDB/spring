package pojo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;

//@Component
@Entity
@Table(name= "product_")
public class Product {
    private int id;
    private String name;
    float price;
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
    @Column(name="price")
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    private Category category;

    @ManyToOne
    @JoinColumn(name="cid")
    public Category getCategory() {
        return category;
    }
    //@Autowired
    public void setCategory(Category category) {
        this.category = category;
    }
}
