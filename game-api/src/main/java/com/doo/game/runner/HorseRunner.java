package com.doo.game.runner;

public class HorseRunner implements Runnable {

    private static final String MSG_TEMPLATE = "출력중 [%s] [%d회]";
    private final String horseNo;


    public HorseRunner(String horseNo){
        this.horseNo = horseNo;

    }

    public void run(){

        for (int i =1; i< 100; i++){

            System.out.println(String.format(MSG_TEMPLATE, horseNo, i));
        }

        System.out.println("run call");

    }
}
