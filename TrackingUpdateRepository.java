package com.gdc.realTimeTracking.repository;

import com.gdc.realTimeTracking.entity.TrackingUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackingUpdateRepository extends JpaRepository<TrackingUpdate,Long> {
}
