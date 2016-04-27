package com.loskut.model;



import javax.persistence.*;
import org.hibernate.annotations.Index;

/**
 * Created by RAYANT on 15.01.2016.
 */

@Entity
@Table(name="colors")
@org.hibernate.annotations.Table(appliesTo = "colors",
        indexes = {
                @Index(name = "rgb",
                        columnNames = {"red", "green","blue"}
                )
        }
)
public class Color {


    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "auto_id_color",
            sequenceName = "auto_id_color",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "auto_id_color")
    private int id;

    private int red;

    private int green;

    private int blue;

    public Color() {
    }

    @Override
    public String toString() {
        return "Color{" +
                "id=" + id +
                ", red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }

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

}
