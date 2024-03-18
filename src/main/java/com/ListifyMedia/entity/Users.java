package com.ListifyMedia.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Table(name="users")
@Data
@ToString
public class Users implements Serializable {
    @Column(name = "userid")
    private int userId;
    @Column(name = "user_name")
    private String userName;
    private String password;
    private String email;
    private String role;
    @Column(name = "is_admin")
    private boolean isAdmin;
}
