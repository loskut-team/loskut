package com.loskut.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.loskut.model.enums.FeatureType;

import javax.persistence.*;

/**
 * Created by RAYANT on 16.01.2016.
 */
@Entity
@Table(name="features")
public class Feature{

    @Id
    @Column(name = "id")
    @SequenceGenerator(name="auto_id_feature",
            sequenceName="auto_id_feature",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="auto_id_feature")
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "feature_name")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private FeatureType featureType;


    public Feature() {
    }

    @Override
    public String toString() {
        return "Feature{" +
                "id=" + id +
                ", fetchType=" + featureType +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public FeatureType getFeatureType() {
        return featureType;
    }

    public void setFeatureType(FeatureType featureType) {
        this.featureType = featureType;
    }

}
