package com.loskut.model;

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

    @JoinColumn(name = "id_client")
    @ManyToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    private User user;

    public Order() {
    }

    @OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "order")
    private Set<Cloth> clothSet;

    @Column(name = "total_price")
    @Digits(integer=8, fraction=2)
    private BigDecimal totalPrice;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
}
