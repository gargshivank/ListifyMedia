package com.ListifyMedia.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Table(name="keyactors")
@Data
@ToString
public class KeyActors implements Serializable {
    @Column(name = "media_id")
    private int mediaId;
    @Column(name = "actor_id")
    private int actorId;
}
