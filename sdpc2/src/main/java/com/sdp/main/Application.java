package com.sdp.main;

import com.sdp.beans.MessageProducer;
import com.sdp.beans.MessageWriter;
import com.sdp.helper.ApplicationFactory;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        MessageWriter messageWriter = (MessageWriter) ApplicationFactory.createObject("messageWriter");
        MessageProducer messageProducer = (MessageProducer) ApplicationFactory.createObject("messageProducer");
        messageWriter.setProducer(messageProducer);
        messageWriter.writeMessage("here is the example of sdp completely loosely coupled ");
    }
}
