package com.mlnx.springmvc.mybatis.mapper;

import com.mlnx.springmvc.mybatis.model.TFeedback;
import java.util.List;

public interface TFeedbackMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_feedback
     *
     * @mbggenerated Thu Nov 12 15:45:41 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_feedback
     *
     * @mbggenerated Thu Nov 12 15:45:41 CST 2015
     */
    int insert(TFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_feedback
     *
     * @mbggenerated Thu Nov 12 15:45:41 CST 2015
     */
    TFeedback selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_feedback
     *
     * @mbggenerated Thu Nov 12 15:45:41 CST 2015
     */
    List<TFeedback> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_feedback
     *
     * @mbggenerated Thu Nov 12 15:45:41 CST 2015
     */
    int updateByPrimaryKey(TFeedback record);
}