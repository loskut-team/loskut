package com.loskut.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.loskut.model.enums.OrderStatus;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.math.BigDecimal;
import java.util.Set;

/**
 * Created by RAYANT on 15.01.2016.
 */


@Entity
@Table(name="orders")
public class Order {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name="auto_id_order",
            sequenceName="auto_id_order",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="auto_id_order")
    private int id;

    public Order() {
    }

    @OneToMany (fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Set<Cloth> clothSet;

    @Column(name = "total_price")
    @Digits(integer=8, fraction=2)
    private BigDecimal totalPrice;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @ManyToOne
    @JsonBackReference
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Set<Cloth> getClothSet() {
        return clothSet;
    }

    public void setClothSet(Set<Cloth> clothSet) {
        this.clothSet = clothSet;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", clothSet=" + clothSet +
                ", totalPrice=" + totalPrice +
                ", status=" + status +
                '}';
    }
}
