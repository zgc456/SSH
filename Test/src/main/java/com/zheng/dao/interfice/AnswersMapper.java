package com.zheng.dao.interfice;

import com.zheng.entity.AnswersEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by lenovo on 2018/3/20.
 */
@Repository
public interface AnswersMapper {
    void save(AnswersEntity answersEntity);
}
