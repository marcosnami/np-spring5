package com.naturalprogrammer.spring5tutorial.domain;

import javax.persistence.*;

/**
 * Created by MarcosNami on 10/5/2017.
 */
@Entity
@Table(name = "usr")
public class Users {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 250)
    private String email;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private String password;


}
