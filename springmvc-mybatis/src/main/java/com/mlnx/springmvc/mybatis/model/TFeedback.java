package com.mlnx.springmvc.mybatis.model;

import java.util.Date;

public class TFeedback {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_feedback.id
     *
     * @mbggenerated Thu Nov 12 15:45:41 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_feedback.user_id
     *
     * @mbggenerated Thu Nov 12 15:45:41 CST 2015
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_feedback.timestamp
     *
     * @mbggenerated Thu Nov 12 15:45:41 CST 2015
     */
    private Date timestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_feedback.title
     *
     * @mbggenerated Thu Nov 12 15:45:41 CST 2015
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_feedback.content
     *
     * @mbggenerated Thu Nov 12 15:45:41 CST 2015
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_feedback.id
     *
     * @return the value of t_feedback.id
     *
     * @mbggenerated Thu Nov 12 15:45:41 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_feedback.id
     *
     * @param id the value for t_feedback.id
     *
     * @mbggenerated Thu Nov 12 15:45:41 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_feedback.user_id
     *
     * @return the value of t_feedback.user_id
     *
     * @mbggenerated Thu Nov 12 15:45:41 CST 2015
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_feedback.user_id
     *
     * @param userId the value for t_feedback.user_id
     *
     * @mbggenerated Thu Nov 12 15:45:41 CST 2015
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_feedback.timestamp
     *
     * @return the value of t_feedback.timestamp
     *
     * @mbggenerated Thu Nov 12 15:45:41 CST 2015
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_feedback.timestamp
     *
     * @param timestamp the value for t_feedback.timestamp
     *
     * @mbggenerated Thu Nov 12 15:45:41 CST 2015
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_feedback.title
     *
     * @return the value of t_feedback.title
     *
     * @mbggenerated Thu Nov 12 15:45:41 CST 2015
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_feedback.title
     *
     * @param title the value for t_feedback.title
     *
     * @mbggenerated Thu Nov 12 15:45:41 CST 2015
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_feedback.content
     *
     * @return the value of t_feedback.content
     *
     * @mbggenerated Thu Nov 12 15:45:41 CST 2015
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_feedback.content
     *
     * @param content the value for t_feedback.content
     *
     * @mbggenerated Thu Nov 12 15:45:41 CST 2015
     */
    public void setContent(String content) {
        this.content = content;
    }
}