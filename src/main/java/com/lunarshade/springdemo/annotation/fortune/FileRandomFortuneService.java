package com.lunarshade.springdemo.annotation.fortune;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileRandomFortuneService implements FortuneService{

    List<String> fortunes;

    @Value("${address}")
    String file;

    public FileRandomFortuneService() {
    }

    @Override
    public String getFortune() {
        Random random = new Random();
        int rand = random.nextInt(fortunes.size());
        return fortunes.get(rand);
    }

    @PostConstruct
    private void readFromFiles() {
        fortunes = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            String str;
            while ((str = br.readLine()) != null) {
                fortunes.add(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
