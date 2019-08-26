package com.doo.game.controller;

import com.doo.game.runner.HorseRunner;
import com.doo.game.service.HorseService;
import com.doo.game.service.RspService;
import com.doo.game.vo.HorseResultVo;
import com.doo.game.vo.RspResultVo;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/horse")
public class HorseRestController {

    @Autowired
    private HorseService horseService;

    @PostMapping
    public HorseResultVo play(@ApiParam(value = "가위-1, 바위-2, 보-3", required = false) @RequestParam Integer playNumber) {
       return horseService.Play(playNumber);
    }

}
