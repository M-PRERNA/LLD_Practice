package com.assignment.question;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SocialMediaPost{
    private String id;
    private String content;
    private Long userId;
    private Long timestamp;

    // public SocialMediaPost(String id, String content, Long userId, Long timeStamp)
    
}