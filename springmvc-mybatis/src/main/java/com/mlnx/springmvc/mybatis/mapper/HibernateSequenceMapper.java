package com.mlnx.springmvc.mybatis.mapper;

import com.mlnx.springmvc.mybatis.model.HibernateSequence;
import java.util.List;

public interface HibernateSequenceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hibernate_sequence
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    int insert(HibernateSequence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hibernate_sequence
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    List<HibernateSequence> selectAll();
}