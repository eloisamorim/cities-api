package com.github.eloisamorim.citiesapi.cities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "City")
@Table(name = "cidade")
public class City {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "uf")
    private String uf;

    @Column(name = "ibge")
    private Integer ibge;



}
