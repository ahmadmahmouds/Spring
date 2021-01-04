package com.java.StringAssignment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class StringTest {
    @RequestMapping("")
    public  String getSomeString(){
        return "welcome to a new Stack";
    }


    @RequestMapping("/random")
    public  String getRandomString(){
        String [] niceString=new String[3];
           niceString[0]="your welcome";
           niceString[1]="nice to meet you";
           niceString[2]="i hope to see you again";
        Random r =new Random();
        return niceString[r.nextInt(3)];
    }

}
