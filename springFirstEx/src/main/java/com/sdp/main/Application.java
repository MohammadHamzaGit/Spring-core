package com.sdp.main;

import com.sdp.beans.MessageProducer;
import com.sdp.beans.MessageWriter;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

class Application{
    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);

        reader.loadBeanDefinitions(new ClassPathResource("application-properties.xml"));

        MessageWriter messageWriter = (MessageWriter) beanFactory.getBean("messageWriter");
        MessageProducer messageProducer = (MessageProducer) beanFactory.getBean("htmlMessageProducer");
        //MessageProducer PDFmessageProducer = (MessageProducer) beanFactory.getBean("pdfMessageProducer");
        messageWriter.setProducer(messageProducer);
        messageWriter.writeMessage("Welcome to Spring ");
    }
}