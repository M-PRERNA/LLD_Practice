package com.assignment.question;
import java.util.*;
public interface SocialMediaAdapter {
    public List<SocialMediaPost> fetchPosts(Long userId, Long timestamp);
    public void addPost(Long userId, String text);

}