package com.gdc.realTimeTracking.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Setter
@Getter
@Entity
@Table(name = "tracking_update",schema = "trackingdb")
public class TrackingUpdate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long update_id;
    private Long tracking_id;
    @Column(nullable = false, length = 100)
    private Float latitude;

    @Column(nullable = false, length = 100)
    private Float longitude;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    @PrePersist
    protected void onCreate() {
        timestamp = LocalDateTime.now();

    }
}
