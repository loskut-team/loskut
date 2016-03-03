package com.loskut.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.loskut.model.enums.ClothTypeName;

import javax.persistence.*;

/**
 * Created by RAYANT on 16.01.2016.
 */

@Entity
@Table(name="cloth_type")
public class ClothType {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name="auto_id_type",
            sequenceName="auto_id_type",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="auto_id_type")
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_name")
    private ClothTypeName clothTypeName;


    public ClothType() {
    }

    @Override
    public String toString() {
        return "ClothType{" +
                "id=" + id +
                ", clothTypeName=" + clothTypeName +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClothTypeName getClothTypeName() {
        return clothTypeName;
    }

    public void setClothTypeName(ClothTypeName clothTypeName) {
        this.clothTypeName = clothTypeName;
    }

}
