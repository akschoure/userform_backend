package com.dev.userform.pojos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user")
public class User extends BaseEntity {
    @Column(length=30)
    private String firstName;
    @Column(length=30)
    private String lastName;
    @Column(length=30,unique = true)
    private String userName;
    private int age;
    private double salery;



}
