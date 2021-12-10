package com.example.aisserver.orm;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "vessel")
public class Vessel {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "type_id")
    private Long typeId;

    @Column(name = "name")
    private String name;

    @Column(name = "mmsi")
    private Integer mmsi;

    @Column(name = "imo")
    private Integer imo;

}
