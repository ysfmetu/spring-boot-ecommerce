package com.luv2code.ecommerce.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="ilceler")
@Data
public class County {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ilce_no")
    private int countyId;

    @Column(name = "isim")
    private String countyName;
    @ManyToOne
    @JoinColumn(name="province_id")
    private Province province;

}
