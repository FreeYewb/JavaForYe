package com.bo.wen.ye.beifeng.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 读写配置文件范例一
 * 
 * @author Administrator
 *
 */
public class PropertiesFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO Auto-generated method stub
        Properties prop = new Properties();// 创建Properties的实例
        File input = new File("config.properties");// 读取properties后缀的一定要Properties prop = new Properties()
        prop.load(new FileInputStream(input));
        // prop.load(new FileReader(input));
        System.out.println(prop.getProperty("admin_username"));// 读取
        prop.setProperty("key", "value");

        File file = new File("new.properties");
        prop.store(new FileOutputStream(file), "属性列表的描述");
        prop.store(new FileOutputStream(input), "oll");
    }

}
