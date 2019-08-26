package com.doo.game.service;

import com.doo.game.vo.RspResultVo;
import org.springframework.stereotype.Service;

@Service
public class RspService {
    public RspResultVo Play(Integer playNumber){

        /*
         * 컴퓨터와 가위,바위,보 게임을 해서 몇번을 이기는지 승률 알아보기.
         * 가위[1] 바위[2] 보[3]
         */
        String comStr="",userStr="", resultStr="";

        //게임 시작
        System.out.println("===============GAME START================");
            //1~3의 랜덤 숫자
            int computer =(int)(Math.random()*3)+1;
            //사용자 입력값
            int user = playNumber;
            //컴퓨터 값
            if(computer == 1) {
                comStr="가위";
            }else if(computer == 2) {
                comStr="바위";
            }else if(computer == 3) {
                comStr="보";
            }else {
                comStr="시스템 오류";
            }
            //유저의 값
            if(user == 1) {
                userStr="가위";
            }else if(user == 2) {
                userStr="바위";
            }else if(user == 3) {
                userStr="보";
            }else {
                userStr="손가락 오류";
            }

            if(user >= 1 && user <= 3) {
                if((computer == 1 && user == 2) || (computer == 2 && user == 3) || (computer == 3 && user == 1)) {
                    resultStr="승리";
                }else if(computer == user) {
                    resultStr="무승부";
                }else {
                    resultStr="패배";
                }
            }else {
                System.out.println("값을 잘못 입력 하였습니다.");
            }

        System.out.println("=========================================");
        return RspResultVo.create(userStr,comStr,resultStr);

    }


}
