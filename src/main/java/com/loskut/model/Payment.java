package com.loskut.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by RAYANT on 16.01.2016.
 */

@Entity
@Table(name="payments")
public class Payment {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name="auto_id_payment",
            sequenceName="auto_id_payment",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="auto_id_payment")
    private int id;


    private BigDecimal amount;

    private String comment;

    private String status;

    @Column(name = "id_order")
    private int orderId;

    @Column(name = "date_time")
    private Date date;

    public Payment() {
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", amount=" + amount +
                ", comment='" + comment + '\'' +
                ", status='" + status + '\'' +
                ", orderId=" + orderId +
                ", date=" + date +
                '}';
    }
}
