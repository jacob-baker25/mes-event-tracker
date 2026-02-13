package com.github.jacobbaker.mes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.jacobbaker.mes.domain.ProductionEvent;
import com.github.jacobbaker.mes.repository.ProductionEventRepository;
import java.util.List;

@Service
public class ProductionEventService {
    // logic to handle production events, e.g., saving to database, processing, etc.
    @Autowired
    private ProductionEventRepository productionEventRepository;

    public void saveEvent(ProductionEvent event) {
        productionEventRepository.save(event);
    }

    public List<ProductionEvent> getAllEvents() {
        return productionEventRepository.findAll();
    }
}
