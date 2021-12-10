package com.example.aisserver.orm;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "vessel_type")
public class VesselType {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

}
