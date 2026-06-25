package com.sdp.helper;

import java.io.IOException;
import java.util.Properties;

public class ApplicationFactory {
    public static Object createObject(String logicalClassName) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Properties prop = new Properties();
        prop.load(ApplicationFactory.class.getClassLoader().getResourceAsStream("application.properties"));
        String fqcn = prop.getProperty(logicalClassName);

        Class<?> clazz = Class.forName(fqcn);
        Object object = clazz.newInstance();
        return object;
    }
}
