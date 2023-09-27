package com.project.boggingsite.comment;

import com.project.boggingsite.blog.BlogEntity;
import com.project.boggingsite.commons.BaseEntity;
import com.project.boggingsite.user.UserEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity(name="comments")

public class CommentEntity extends BaseEntity {
    @Column(nullable = false, length = 150)
    String title;
    @Column(nullable = false, length = 550)
    String body;

    @ManyToOne
    UserEntity author;

    @ManyToOne
    BlogEntity blog;
}
