package com.mlnx.springmvc.mybatis.model;

import java.util.Date;

public class TReport {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_report.id
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_report.title
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_report.body
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    private String body;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_report.author
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    private String author;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_report.time
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    private Date time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_report.suggest
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    private String suggest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_report.user_id
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_report.id
     *
     * @return the value of t_report.id
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_report.id
     *
     * @param id the value for t_report.id
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_report.title
     *
     * @return the value of t_report.title
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_report.title
     *
     * @param title the value for t_report.title
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_report.body
     *
     * @return the value of t_report.body
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public String getBody() {
        return body;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_report.body
     *
     * @param body the value for t_report.body
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_report.author
     *
     * @return the value of t_report.author
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_report.author
     *
     * @param author the value for t_report.author
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_report.time
     *
     * @return the value of t_report.time
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_report.time
     *
     * @param time the value for t_report.time
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_report.suggest
     *
     * @return the value of t_report.suggest
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public String getSuggest() {
        return suggest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_report.suggest
     *
     * @param suggest the value for t_report.suggest
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public void setSuggest(String suggest) {
        this.suggest = suggest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_report.user_id
     *
     * @return the value of t_report.user_id
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_report.user_id
     *
     * @param userId the value for t_report.user_id
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}