package com.codeup.blog.blog.controllers;

import com.codeup.blog.blog.Post;
import com.codeup.blog.blog.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.description;

@Controller
public class PostController {

//    private final PostRepository postsDao;

    ArrayList<Post> postsList;

    public PostController() {
        this.postsList = new ArrayList<Post>();

        postsList.add(new Post(1, "fist post", "new"));
        postsList.add(new Post(2, "second post", "Second post"));
    }

    @GetMapping("/posts")
    public String index(Model viewModel){
        viewModel.addAttribute("posts", postsList);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String show(@PathVariable long id, Model viewModel){
        viewModel.addAttribute("posts", postsList.get((int)id - 1));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String showCreateForm()  {
        return "View the form for creating a post.";
    }

    @GetMapping("posts/{id}")
    public String create(@RequestParam String title, @RequestParam String body) {
        System.out.println("title = " + title);
        System.out.println("body = " + body);
        return "create a new ad.";
    }

//    @PostMapping("posts/{id}/edit")
//    public String update(@PathVariable long id, @RequestParam String title) {
//        Ad oldAd = adDao.getOne(id);
//        oldAd.setTitle(title);
//        oldAd.setDescription(description);
//        adDao.save(oldAd);
//        return "redirect:/ads/" + id;
//    }
//
//    @PostMapping("ads/{id}/delete")
//    public String delete(@PathVariable long id) {
//        adDao.deleteById(id);
//        return "redirect: /ads/";
//    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String showPostForm(){
        return "view the form for creating a post";
    }

    @PostMapping ("/posts/create")
    @ResponseBody
    public String createPost(@RequestParam String title, @RequestParam String body){
        System.out.println("title = " + title);
        System.out.println("body = " + body);
        return "create a new post";
    }
}