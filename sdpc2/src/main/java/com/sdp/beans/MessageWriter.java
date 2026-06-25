package com.sdp.beans;

public class MessageWriter {
    MessageProducer producer;
    public MessageProducer setProducer(MessageProducer producer) {
        this.producer = producer;
        return producer;
    }
    public void writeMessage(String message){
        System.out.println(producer.createMessage(message));
    }
}
