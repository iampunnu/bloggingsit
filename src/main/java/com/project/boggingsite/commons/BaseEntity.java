package com.project.boggingsite.commons;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.UUID;

@Data
@MappedSuperclass
public class BaseEntity {
    //    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//    @Column(nullable = false)
//    UUID id;
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(nullable = false)
    UUID id;

    @CreatedDate
    @Column(nullable = false)
    Date createdAt;

    @PrePersist
    public void onCreate() {
        Timestamp timestamp = Timestamp.from(Instant.now());
        this.createdAt = timestamp;
    }
}