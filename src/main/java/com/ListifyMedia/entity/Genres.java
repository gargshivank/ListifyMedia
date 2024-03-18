package com.ListifyMedia.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Table(name="genres")
@Data
@ToString
public class Genres implements Serializable {
    @Column(name = "genre_id")
    private int genreId;
    @Column(name = "genre_name")
    private int genreName;
}
