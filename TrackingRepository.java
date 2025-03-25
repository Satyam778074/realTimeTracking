package com.gdc.realTimeTracking.repository;

import com.gdc.realTimeTracking.entity.Tracking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackingRepository extends JpaRepository<Tracking,Long> {
}
