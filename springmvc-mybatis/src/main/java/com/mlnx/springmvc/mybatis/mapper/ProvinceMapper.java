package com.mlnx.springmvc.mybatis.mapper;

import com.mlnx.springmvc.mybatis.model.Province;
import java.util.List;

public interface ProvinceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    int insert(Province record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    Province selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    List<Province> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    int updateByPrimaryKey(Province record);
}