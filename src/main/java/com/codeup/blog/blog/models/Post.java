package com.codeup.blog.blog.models;

import javax.persistence.*;

public class Post {

    @Entity
    @Table(name = "posts")
    public class Post {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(columnDefinition = "int(11) UNSIGNED")
        private long id;

        @Column(length = 100, nullable = false)
        private String title;

        @Column(columnDefinition = "TEXT")
        private String description;

        public Post() {

        }

        public Post(long id, String title, String description) {
            this.id = id;
            this.title = title;
            this.description = description;
        }

    }
}
