package com.doo.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);

        DateFormat unsafeDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal1 = Calendar.getInstance();
        cal1.set(1989, Calendar.MARCH, 10);
        Date date1 = cal1.getTime();
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2020, Calendar.JULY, 20);
        Date date2 = cal2.getTime();

        Thread thread1 = new Thread(()->{
            for (int i=0; i<100;i++){
                try {
                    String result;
                    synchronized (unsafeDateFormat) {
                      result = unsafeDateFormat.format(date1);
                    }
                    System.out.println("Thread 1 : " + result);
                } catch (Exception e){
                    e.printStackTrace();
                    break;
                }
            }
        });
        
        Thread thread2 = new Thread(()->{
            for (int i=0; i<100;i++){
                try {
                    String result;
                    synchronized (unsafeDateFormat) {
                        result = unsafeDateFormat.format(date2);
                    }
                    System.out.println("Thread 2 : " + result);
                } catch (Exception e){
                    e.printStackTrace();
                    break;
                }
            }
        });


        thread1.start();
        thread2.start();

    }
}
