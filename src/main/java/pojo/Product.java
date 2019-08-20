package pojo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Set;

//@Component
@Entity
@Table(name= "product_")
public class Product {
    private int id;
    private String name;
    float price;
    Set<User> users;
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

    @ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinTable(
            name="user_product_",
            joinColumns=@JoinColumn(name="pid"),
            inverseJoinColumns=@JoinColumn(name="uid")
    )
    public Set<User> getUsers() {
        return users;
    }
    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
