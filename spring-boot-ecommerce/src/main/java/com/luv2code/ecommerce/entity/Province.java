package com.luv2code.ecommerce.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "iller")
@Data
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "il_no")
    private int ilkodu;
    @Column(name = "isim")
    private String iladi;
    @OneToMany(mappedBy = "province")
    @JsonIgnore
    private List<County> counties;

}
