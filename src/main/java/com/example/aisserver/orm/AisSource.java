package com.example.aisserver.orm;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "ais_source")
public class AisSource {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;


}
