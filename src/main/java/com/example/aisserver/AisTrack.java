package com.example.aisserver;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "ais_track")
public class AisTrack {
    @Id
    @Getter
    @Setter
    private Integer id;

    private Integer vessel_id;
    private Integer source_id;

    private Integer status_code;
    private Double latitude;
    private Double longitude;

    private String position;
    private String destination;

    private Double heading;
    private Double course;
    private Double draught;
    private Double speed;
    private Double rot;

    private String eta;
    private Timestamp rec_date;
}
