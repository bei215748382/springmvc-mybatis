package com.mlnx.springmvc.mybatis.mapper;

import com.mlnx.springmvc.mybatis.model.Question;
import java.util.List;

public interface QuestionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    int insert(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    Question selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    List<Question> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    int updateByPrimaryKey(Question record);
}