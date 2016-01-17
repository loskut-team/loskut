package com.loskut.model;

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


    @JoinColumn(name = "id_cloth")
    @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    private Cloth cloth;

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

    public Cloth getCloth() {
        return cloth;
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }
}
