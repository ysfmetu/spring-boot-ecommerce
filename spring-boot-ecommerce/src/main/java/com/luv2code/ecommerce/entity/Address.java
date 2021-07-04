package com.luv2code.ecommerce.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "street")
    private String street;
    @Column(name = "county")
    private String county;
    @Column(name = "province")
    private String province;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Order order;
}
