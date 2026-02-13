package com.github.jacobbaker.mes.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.jacobbaker.mes.domain.ProductionEvent;

@Repository
public interface ProductionEventRepository extends JpaRepository<ProductionEvent, UUID> {
    
}
