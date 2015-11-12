package com.mlnx.springmvc.mybatis.model;

import java.util.Date;

public class Question {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.id
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.title
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.body
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    private String body;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.author
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    private String author;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.state
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.time
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    private Date time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.id
     *
     * @return the value of question.id
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.id
     *
     * @param id the value for question.id
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.title
     *
     * @return the value of question.title
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.title
     *
     * @param title the value for question.title
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.body
     *
     * @return the value of question.body
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public String getBody() {
        return body;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.body
     *
     * @param body the value for question.body
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.author
     *
     * @return the value of question.author
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.author
     *
     * @param author the value for question.author
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.state
     *
     * @return the value of question.state
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.state
     *
     * @param state the value for question.state
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.time
     *
     * @return the value of question.time
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.time
     *
     * @param time the value for question.time
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public void setTime(Date time) {
        this.time = time;
    }
}