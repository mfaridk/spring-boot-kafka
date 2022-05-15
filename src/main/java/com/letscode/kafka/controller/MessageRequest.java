package com.letscode.kafka.controller;

public class  MessageRequest {

    private String message;
    private String messageId;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString()  {
        return "{ message:" + this.getMessage() +", messageId:"+this.getMessageId() +"}";
    }
}
