package com.sdp.beans;

public class MessageWriter {
    MessageProducer producer;
    public void setProducer(MessageProducer producer) {
        this.producer = producer;
    }
    public void writeMessage(String message) {

        System.out.println(producer.createMessage(message));
    }
}
