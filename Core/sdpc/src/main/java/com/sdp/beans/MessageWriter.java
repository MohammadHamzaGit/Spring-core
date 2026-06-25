package com.sdp.beans;

public class MessageWriter {
    MessageProducer producer;
    public void writeMessage(String message){
        producer = new PDFMessageProducer();
        System.out.println(producer.createMessage(message));
    }
}
