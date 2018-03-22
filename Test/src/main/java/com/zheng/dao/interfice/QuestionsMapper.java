package com.zheng.dao.interfice;

import com.zheng.entity.QuestionsEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lenovo on 2018/3/20.
 */
@Repository
public interface QuestionsMapper {
    void save(QuestionsEntity questionsEntity);
    List<QuestionsEntity> selectAll();
    QuestionsEntity getById(Integer id);
}
