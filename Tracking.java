package com.gdc.realTimeTracking.entity;


import jakarta.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Entity
@Setter
@Getter
@Table(name = "tracking_info",schema = "trackingdb")
public class Tracking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tracking_id;
    private Long ride_id;
    private Long goods_id;
    private Long driver_id;
    private Long sender_id;

    @Column(nullable = false,length=100)
    private String pickup_location;

    @Column(nullable = false,length=100)
    private String delivery_location;

    @Column(nullable = false,length=100)
    private String status;

    @Column(nullable = false)
    private LocalDateTime started_at;

    @Column(nullable = false)
    private LocalDateTime completed_at;


    @PrePersist
    protected void onCreate() {
        started_at = LocalDateTime.now();
        completed_at = LocalDateTime.now();

    }
}
