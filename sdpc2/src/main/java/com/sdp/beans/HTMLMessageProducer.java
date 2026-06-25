package com.sdp.beans;

public class HTMLMessageProducer implements MessageProducer {
    public String createMessage(String message) {
        return "<HTML>" + message + "</HTML>";
    }
}
