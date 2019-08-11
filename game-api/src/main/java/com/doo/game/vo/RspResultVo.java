package com.doo.game.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "create")
public class RspResultVo {
    private String userPlay;
    private String comPlay;
    private String playResult;

}
