package com.zheng.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.zheng.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by lenovo on 2018/3/20.
 */
public class QuestionsSelectAllAction implements Action {
    @Autowired
    QuestionsService questionsService;
    @Override
    public String execute() throws Exception {
        Map map= ActionContext.getContext().getSession();
        map.put("list",questionsService.selectAll());
        return  Action.SUCCESS;
    }
}
