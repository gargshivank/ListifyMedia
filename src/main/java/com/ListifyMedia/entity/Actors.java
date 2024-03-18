package com.ListifyMedia.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Table(name="actors")
@Data
@ToString
public class Actors implements Serializable {
    @Column(name = "actor_id")
    private int actorId;
    @Column(name = "actor_name")
    private int actorName;
}
