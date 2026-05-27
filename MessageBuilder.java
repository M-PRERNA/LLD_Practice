package com.learn.spring.lld;

//package com.assignment.question;

@WithBuilder
public class MessageBuilder{
    public MessageType messageType;
    public String content;
    public String sender;
    public String recipient;
    public boolean isDelivered;
    public long timestamp;

    //private constructor can be accessed only by Builder class
    private MessageBuilder(Builder builder){
        this.messageType = builder.messageType;
        this.content = builder.content;
        this.sender = builder.sender;
        this.recipient = builder.recipient;
        this.isDelivered = builder.isDelivered;
        this.timestamp = builder.timestamp;
    }
    public static class Builder{

        private MessageType messageType;
        private String content;
        private String sender;
        private String recipient;
        private boolean isDelivered;
        private long timestamp;

        // private MessageBuilder messageBuilder;

        // public Builder(){
        //     messageBuilder = new MessageBuilder();
        // }

        public Builder messageType(MessageType messageType){
            // messageBuilder.messageType = messageType;
            this.messageType = messageType;
            return this;
        }

        public Builder content(String content){
            // messageBuilder.content = content;
            this.content = content;
            return this;
        }

        public Builder sender(String sender){
            // messageBuilder.sender = sender;
            this.sender = sender;
            return this;
        }

        public Builder recipient(String recipient){
            // messageBuilder.recipient = recipient;
            this.recipient = recipient;
            return this;
        }

        public Builder isDelivered(boolean isDelivered){
            // messageBuilder.isDelivered = isDelivered;
            this.isDelivered = isDelivered;
            return this;
        }

        public Builder timestamp(long timestamp){
            // messageBuilder.timestamp = timestamp;
            this.timestamp = timestamp;
            return this;
        }

        public MessageBuilder build() {
            return new MessageBuilder(this);
            // MessageBuilder messageBuilder = new MessageBuilder();
            // messageBuilder.messageType = this.messageBuilder.messageType;
            // messageBuilder.content = this.messageBuilder.content;
            // messageBuilder.sender = this.messageBuilder.sender;
            // messageBuilder.recipient = this.messageBuilder.recipient;
            // messageBuilder.isDelivered = this.messageBuilder.isDelivered;
            // messageBuilder.timestamp = this.messageBuilder.timestamp;
            // return messageBuilder;
        }
    }

}