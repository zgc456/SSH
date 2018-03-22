package com.zheng.dao.impl;

import com.zheng.dao.interfice.QuestionsMapper;
import com.zheng.entity.QuestionsEntity;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2018/3/20.
 */

@Repository
public class QuestionsImpl extends HibernateDaoSupport implements QuestionsMapper {
    @Resource
    public void setSessionFacotry(SessionFactory sessionFacotry) {
        super.setSessionFactory(sessionFacotry);
    }
    @Override
    public void save(QuestionsEntity questionsEntity) {
        this.getHibernateTemplate().save(questionsEntity);
    }

    @Override
    public List<QuestionsEntity> selectAll() {
        return (List<QuestionsEntity>)this.getHibernateTemplate().find("from com.zheng.entity.QuestionsEntity");
    }
    @Override
    public QuestionsEntity getById(Integer id) {
        return this.getHibernateTemplate().get(QuestionsEntity.class,id);
    }
}
