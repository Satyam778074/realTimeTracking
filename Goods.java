package com.gdc.realTimeTracking.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Data
@Table(name ="goods_info",schema = "trackingdb")
public class Goods {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long goods_id;

private Long sender_id;

private Long ride_id;

@Column(nullable = false,length=100)
private String description;

@Column(nullable = false,length=100)
private float weight;

@Column(nullable = false,length=100)
private String status;

@Column(nullable = false)
private LocalDateTime created_at;

    @PrePersist
    protected void onCreate() {
        created_at = LocalDateTime.now();


    }
}
