package com.assignment.question;
import com.assignment.question.external.*;
import java.util.*;
import com.assignment.question.external.TwitterApi;

public class TwitterApiAdapter implements SocialMediaAdapter{

    TwitterApi twitterApi;

    public TwitterApiAdapter(){
        twitterApi = new TwitterApi();
    }

    @Override
    public List<SocialMediaPost> fetchPosts(Long userId, Long timestamp){
        TwitterTweet twitterTweet = twitterApi.getTweets(userId).get(0);
        return List.of(new SocialMediaPost(twitterTweet.getId(), twitterTweet.getTweet(), twitterTweet.getUserId(), timestamp));
    }

    @Override
    public void addPost(Long userId, String text){
        twitterApi.tweet(userId, text);
    }
}
