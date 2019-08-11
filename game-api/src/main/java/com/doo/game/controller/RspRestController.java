package com.doo.game.controller;

import com.doo.game.service.RspService;
import com.doo.game.vo.RspResultVo;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/rsp")
public class RspRestController {

    @Autowired
    private RspService rspService;

    @PostMapping
    public RspResultVo play(@ApiParam(value = "가위-1, 바위-2, 보-3", required = false) @RequestParam Integer playNumber){
       return rspService.Play(playNumber);
    }

}
