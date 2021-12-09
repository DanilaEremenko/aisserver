package com.example.aisserver.orm;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vessel")
public class Vessel {
    @Id
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private Long typeId;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private Integer mmsi;

    @Getter
    @Setter
    private Integer imo;

}
