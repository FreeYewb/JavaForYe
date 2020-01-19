package com.bo.wen.ye.junit4.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreateTest {
	public static void main(String[] args) {
		Path wiki_path = Paths.get("E:/Temp/wiki", "wiki.txt");

        Charset charset = Charset.forName("UTF-8");
        //try (BufferedReader reader = Files.newBufferedReader(wiki_path, StandardCharsets.UTF_8)) {
        try (BufferedReader reader = Files.newBufferedReader(wiki_path, charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println(e);
        }
	}
}
