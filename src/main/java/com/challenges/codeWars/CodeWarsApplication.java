package com.challenges.codeWars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CodeWarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeWarsApplication.class, args);
    }

    public static int rowSumOddNumbers(int n) {
        List<Integer> pyramid = new ArrayList<Integer>();
        int totalNum = 0;
        int sumOdd = 0;
        int numFind = 0;
        int count = 1;

        for (int i = 1; i <= n; i++) {
            totalNum += i;
        }
        while (numFind != totalNum) {
            if (count % 2 != 0) {
                pyramid.add(count);
                numFind++;
            }
            count++;
        }
        for (int i = pyramid.size() - n; i < pyramid.size(); i++) {
            sumOdd += pyramid.get(i);
        }
        return sumOdd;
    }

}
