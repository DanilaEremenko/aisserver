package com.example.aisserver;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vessel_type")
public class VesselType {
    @Id
    @Getter
    @Setter
    private Long id;

}
