package com.loskut.model;

import javax.persistence.*;

/**
 * Created by RAYANT on 16.01.2016.
 */
@Entity
@Table(name="features")
public class Feature {

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
    private FetchType fetchType;


    @JoinColumn(name = "id_cloth")
    @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    private Cloth cloth;

    public Feature() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public FetchType getFetchType() {
        return fetchType;
    }

    public void setFetchType(FetchType fetchType) {
        this.fetchType = fetchType;
    }

    public Cloth getCloth() {
        return cloth;
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }
}
