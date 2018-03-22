package com.zheng.service;

import com.zheng.dao.impl.QuestionsImpl;
import com.zheng.entity.QuestionsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lenovo on 2018/3/20.
 */
@Service
@Transactional(readOnly =false)
public class QuestionsService {
    @Autowired
   private QuestionsImpl questionsMapper;
    public void save(QuestionsEntity questionsEntity){
        questionsMapper.save(questionsEntity);
    }
   public List<QuestionsEntity> selectAll(){
         return questionsMapper.selectAll();
    }
   public QuestionsEntity getById(Integer id){
        return questionsMapper.getById(id);
    }
}
