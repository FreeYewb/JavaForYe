package com.bo.wen.ye.beifeng.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesXml {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        File input = new File("config.xml");
        prop.loadFromXML(new FileInputStream(input));
        prop.setProperty("key", "value");
        File out = new File("new.xml");
        prop.storeToXML(new FileOutputStream(out), "啦啦啦啦");
    }

}
