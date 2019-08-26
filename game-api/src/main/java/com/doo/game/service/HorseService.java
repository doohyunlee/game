package com.doo.game.service;

import com.doo.game.runner.HorseRunner;
import com.doo.game.vo.HorseResultVo;
import com.doo.game.vo.RspResultVo;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Service
public class HorseService {

    public HorseResultVo Play(Integer playNumber) {

        HorseRunner horseRunner1 = new HorseRunner("no1");
        HorseRunner horseRunner2 = new HorseRunner("no2");
        HorseRunner horseRunner3 = new HorseRunner("no3");

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(horseRunner1);
        executorService.execute(horseRunner2);
        executorService.execute(horseRunner3);
        executorService.shutdown();

        try {
            if(!executorService.awaitTermination(5, TimeUnit.MINUTES)){
                executorService.shutdownNow();
            }

        } catch (InterruptedException e){
            e.printStackTrace();
            executorService.shutdownNow();
        }
        return new HorseResultVo();

    }


}
