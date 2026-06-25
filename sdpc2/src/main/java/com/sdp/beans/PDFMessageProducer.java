package com.sdp.beans;

public class PDFMessageProducer implements MessageProducer {
    public String createMessage(String message){
        return "<PDF>"+ message+"</PDF>";
    }

}
