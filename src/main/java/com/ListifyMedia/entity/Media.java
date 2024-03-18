package com.ListifyMedia.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="actors")
@Data
@ToString
public class Media implements Serializable {
    private int id;
    private String title;
    @Column(name = "release_date")
    private LocalDate releaseDate;
    private int duration;
    private String description;
    @Column(name = "is_movie")
    private boolean isMovie;
    @Column(name = "watch_status")
    private boolean watchStatus;
    private int seasons;
    @Column(name = "created_by")
    private int createdBy;
    @Column(name = "modified_by")
    private int modifiedBy;
    @Column(name = "trailer_url")
    private String trailerUrl;
    private String language;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "modified_at")
    private LocalDateTime modifiedAt;
}
