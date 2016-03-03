package com.loskut.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.loskut.model.enums.Fabric;

import javax.persistence.*;

/**
 * Created by RAYANT on 15.01.2016.
 */


@Entity
@Table(name="structure")
public class Structure {


    @Id
    @Column(name = "id")
    @SequenceGenerator(name="auto_id_structure",
            sequenceName="auto_id_structure",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="auto_id_structure")
    private int id;

    @Enumerated(EnumType.STRING)
    private Fabric fabric;




    public Structure() {
    }

    @Override
    public String toString() {
        return "Structure{" +
                "id=" + id +
                ", fabric=" + fabric +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

}
