package com.codeup.blog.blog.repositories;

import com.codeup.blog.blog.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    Post findByTitle(String title);

    @Query("from Post a where a.id like ?1")
    Post getPostById(long id);

    @Query("select title from Post where LENGTH(title) < 10")
    List<String> getPostsOfCertainTitleLength();

    @Query(nativeQuery = true, value = "SELECT title FROM posts WHERE LENGTH(title) < 10")
    List<String> getPostsOfCertainTitleLengthNative();
}
