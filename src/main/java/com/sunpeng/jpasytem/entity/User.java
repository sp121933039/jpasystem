package com.sunpeng.jpasytem.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "user_t")
public class User {

    @Id
    private Long id;
    private String userName;
    private String passWorld;


}
