package com.doo.game.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "create")
public class HorseResultVo {

    private String userPlay;
    private String comPlay;
    private String playResult;
}
