package com.github.jacobbaker.mes.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductionEventRepository extends JpaRepository<ProductionEvent, UUID> {
    
}
