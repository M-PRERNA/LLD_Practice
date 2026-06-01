package com.assignment.question.services;

import com.assignment.question.Observer;
import com.assignment.question.utils.NotificationUtils;

public class SlackService implements Observer{
    @Override
    public void sendNotification(Long taskId, Long id) {
        String subject = "New task assigned";
        String message = "Task %s assigned to user %s";
        NotificationUtils.sendSlack(subject, String.format(message, taskId, id));
    }
}