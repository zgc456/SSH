package com.zheng.dao.impl;

import com.zheng.dao.interfice.AnswersMapper;
import com.zheng.entity.AnswersEntity;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2018/3/20.
 */

@Repository
public class AnswersImpl extends HibernateDaoSupport implements AnswersMapper  {
    @Resource
    public void setSessionFacotry(SessionFactory sessionFacotry) {
        super.setSessionFactory(sessionFacotry);
    }
    @Override
    public void save(AnswersEntity answersEntity) {
       this.getHibernateTemplate().save(answersEntity);
    }
}
