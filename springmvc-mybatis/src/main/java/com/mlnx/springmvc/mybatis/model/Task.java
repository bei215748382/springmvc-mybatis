package com.mlnx.springmvc.mybatis.model;

public class Task {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.task_id
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    private Integer taskId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.task_name
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    private String taskName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.task_id
     *
     * @return the value of task.task_id
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public Integer getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.task_id
     *
     * @param taskId the value for task.task_id
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.task_name
     *
     * @return the value of task.task_name
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.task_name
     *
     * @param taskName the value for task.task_name
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}