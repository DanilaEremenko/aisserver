package com.example.aisserver.orm;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ais_source")
public class AisSource {
    @Id
    @Getter
    @Setter
    private Long id;


}
