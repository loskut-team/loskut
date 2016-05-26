package com.loskut.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.persistence.criteria.*;
import javax.validation.constraints.Digits;
import java.math.BigDecimal;
import java.util.Set;

/**
 * Created by RAYANT on 15.01.2016.
 */

@Entity
@Table(name = "cloth")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cloth {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "auto_id_cloth",
            sequenceName = "auto_id_cloth",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "auto_id_cloth")
    private int id;

    private String sku;

    @Column(columnDefinition = "varchar(750)")
    private String src;

    @Digits(integer = 8, fraction = 2)
    @Column(name = "price_per_meter")
    private BigDecimal pricePerMeter;

    @Digits(integer = 8, fraction = 2)
    private BigDecimal length;

    @Digits(integer = 8, fraction = 2)
    private BigDecimal width;

    @Digits(integer = 8, fraction = 2)
    @Column(name = "total_price")
    private BigDecimal totalPrice;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Color> colors;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Color mainColor;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Structure> structures;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Feature> features;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<ClothType> tupes;

    @ManyToOne
    @JsonBackReference
    private Order order;

    public Cloth() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Set<Color> getColors() {
        return colors;
    }

    public void setColors(Set<Color> colors) {
        this.colors = colors;
    }

    public Set<Structure> getStructures() {
        return structures;
    }

    public void setStructures(Set<Structure> structures) {
        this.structures = structures;
    }

    public Set<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(Set<Feature> features) {
        this.features = features;
    }

    public Set<ClothType> getTupes() {
        return tupes;
    }

    public void setTupes(Set<ClothType> tupes) {
        this.tupes = tupes;
    }

    public BigDecimal getPricePerMeter() {
        return pricePerMeter;
    }

    public void setPricePerMeter(BigDecimal pricePerMeter) {
        this.pricePerMeter = pricePerMeter;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Color getMainColor() {
        return mainColor;
    }

    public void setMainColor(Color mainColor) {
        this.mainColor = mainColor;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "id=" + id +
                ", sku='" + sku + '\'' +
                ", src='" + src + '\'' +
                ", pricePerMeter=" + pricePerMeter +
                ", length=" + length +
                ", width=" + width +
                ", totalPrice=" + totalPrice +
                ", colors=" + colors +
                ", mainColor=" + mainColor +
                ", structures=" + structures +
                ", features=" + features +
                ", tupes=" + tupes +
                '}';
    }
}

