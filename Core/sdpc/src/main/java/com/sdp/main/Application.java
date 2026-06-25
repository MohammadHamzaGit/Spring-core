package com.sdp.main;

import com.sdp.beans.MessageProducer;
import com.sdp.beans.MessageWriter;

public class Application {
    public static void main(String[] args) {
        MessageWriter mw = new MessageWriter();
        mw.writeMessage("Hello World");
    }
}
