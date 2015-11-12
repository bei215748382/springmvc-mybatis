package com.mlnx.springmvc.mybatis.mapper;

import com.mlnx.springmvc.mybatis.model.TBloodSugarCollection;
import java.util.List;

public interface TBloodSugarCollectionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blood_sugar_collection
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blood_sugar_collection
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    int insert(TBloodSugarCollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blood_sugar_collection
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    TBloodSugarCollection selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blood_sugar_collection
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    List<TBloodSugarCollection> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blood_sugar_collection
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    int updateByPrimaryKey(TBloodSugarCollection record);
}