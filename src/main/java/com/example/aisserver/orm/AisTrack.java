package com.example.aisserver.orm;

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
    private Long id;


    @Setter
    @Getter
    private Integer vessel_id;
    @Setter
    @Getter
    private Integer source_id;

    @Setter
    @Getter
    private Integer status_code;
    @Setter
    @Getter
    private Double latitude;
    @Setter
    @Getter
    private Double longitude;

    @Setter
    @Getter
    private String position;
    @Setter
    @Getter
    private String destination;

    @Setter
    @Getter
    private Double heading;
    @Setter
    @Getter
    private Double course;
    @Setter
    @Getter
    private Double draught;
    @Setter
    @Getter
    private Double speed;
    @Setter
    @Getter
    private Double rot;

    @Setter
    @Getter
    private String eta;
    @Setter
    @Getter
    private Timestamp rec_date;
}
