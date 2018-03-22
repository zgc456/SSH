package com.zheng.action;

import com.opensymphony.xwork2.Action;
import com.zheng.entity.AnswersEntity;
import com.zheng.service.AnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;

/**
 * Created by lenovo on 2018/3/20.
 */

public class AnswersSaveAction implements Action {
    /**
     * 如果想接收页面传输的数据 请自己定义数据 然后定义getset方法
     * 以下注释部分是如果页面传值 请加入这 name跟变量名 属性保持一致
     */
//    private String name;
//    private String message;
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }

    @Autowired
    AnswersService answersService;
    @Override
    public String execute() throws Exception {
        System.out.println(answersService);
        AnswersEntity answersEntity=new AnswersEntity();
        answersEntity.setAnsContent("1");
        answersEntity.setAnsDate(new Date(2017,7,2));
        answersEntity.setQid(1);
        answersService.save(answersEntity);
        return Action.SUCCESS;
    }
}
