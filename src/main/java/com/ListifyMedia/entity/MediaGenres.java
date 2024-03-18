package com.ListifyMedia.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Table(name="mediagenres")
@Data
@ToString
public class MediaGenres implements Serializable {
    @Column(name = "media_id")
    private int mediaId;
    @Column(name = "genre_id")
    private int genreId;
}
