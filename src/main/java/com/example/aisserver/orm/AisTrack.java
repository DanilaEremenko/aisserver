package com.example.aisserver.orm;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "ais_track")
public class AisTrack {
    @Id
    private Long id;

    @Column(name = "vessel_id")
    private Integer vessel_id;
    @Column(name = "source_id")
    private Integer source_id;

//    @Nullable
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "vessel_id")
//    private Vessel vessel;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "source_id")
//    private AisSource aisSource;

    @Column(name = "status_code")
    private Integer status_code;
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "position")
    private String position;
    @Column(name = "destination")
    private String destination;

    @Column(name = "heading")
    private Double heading;
    @Column(name = "course")
    private Double course;
    @Column(name = "draught")
    private Double draught;
    @Column(name = "speed")
    private Double speed;
    @Column(name = "rot")
    private Double rot;

    @Column(name = "eta")
    private String eta;
    @Column(name = "rec_date")
    private Timestamp rec_date;
}
