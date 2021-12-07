package com.example.aisserver;

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

}
