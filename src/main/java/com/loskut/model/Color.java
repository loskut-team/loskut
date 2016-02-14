package com.loskut.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 * Created by RAYANT on 15.01.2016.
 */

@Entity
@Table(name="colors")
public class Color implements java.io.Serializable {


    @Id
    @Column(name = "id")
    @SequenceGenerator(name="auto_id_color",
            sequenceName="auto_id_color",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="auto_id_color")
    private int id;

    private int red;

    private int green;

    private int blue;

    public Color() {
    }

    @JoinColumn(name = "id_cloth")
    @ManyToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonBackReference
    private Cloth cloth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public Cloth getCloth() {
        return cloth;
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }
}
