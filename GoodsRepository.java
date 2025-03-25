package com.gdc.realTimeTracking.repository;

import com.gdc.realTimeTracking.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<Goods,Long>{
}
