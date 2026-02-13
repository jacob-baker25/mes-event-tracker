package com.github.jacobbaker.mes.domain;

import jakarta.persistence.Entity;
import java.util.UUID;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.Instant;
import org.hibernate.annotations.CreationTimestamp;;


@Entity
// If table name is not ProductionEvent, add @Table(name = "whatever the name is") annotation
public class ProductionEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Instant timestamp;

    private String lineID;
    private String machineID;
    private String eventType;

    private Integer value;
    private String reasonCode;
    private String source;

    
}
