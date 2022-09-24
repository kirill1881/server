package com.example.server.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "overone129_groups")
@Data
public class GroupModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "number")
    private int number;

    @Column(name = "students")
    int students;
}
