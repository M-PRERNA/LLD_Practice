package com.assignment.question;
import com.assignment.question.external.*;
import java.util.*;

import com.assignment.question.external.FacebookApi;

public class FacebookApiAdapter implements SocialMediaAdapter{
    FacebookApi facebookApi;

    public FacebookApiAdapter(){
        facebookApi = new FacebookApi();
    }

    @Override
    public List<SocialMediaPost> fetchPosts(Long userId, Long timestamp){
        FacebookPost facebookPost = facebookApi.fetchFacebookPosts(userId, timestamp).get(0);

        return List.of(new SocialMediaPost(facebookPost.getId(), facebookPost.getStatus(), facebookPost.getUserId(), facebookPost.getTimestamp()));
    }

    @Override
    public void addPost(Long userId, String text){
        facebookApi.postFacebookStatus(userId, text);
    }
    
}
