package com.project.boggingsite.blog;

import com.project.boggingsite.commons.BaseEntity;
import com.project.boggingsite.user.UserEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity(name="blogs")

public class BlogEntity extends BaseEntity {
    @Column(nullable = false, length = 150)
    String title;
    @Column(nullable = false, length = 150)
    String slug;
    @Column(nullable = false, length = 50)
    String subtitle;
    @Column(nullable = false, length = 5000)
    String body;

    @ManyToOne
    UserEntity author;
}
