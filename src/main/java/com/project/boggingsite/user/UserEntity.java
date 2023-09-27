package com.project.boggingsite.user;

import com.project.boggingsite.blog.BlogEntity;
import com.project.boggingsite.commons.BaseEntity;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity(name="users")
public class UserEntity extends BaseEntity {
    @Column(nullable = false,length = 30,unique = true)
    String username;
    @Column(nullable = false,length = 50,unique = true)
    String email;
    @Column(nullable = false,length = 150)
    String password;
    @Column(length = 150)
    String bio;
    /*@OneToMany
    List<BlogEntity> blogEntities ;*/


}
