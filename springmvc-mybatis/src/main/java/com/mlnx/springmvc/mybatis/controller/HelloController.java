/**
 * 
 */
/**
 * @author bwh<bruce.bei@nbmlnx.com>
 * 2015年10月29日
 *
 */
package com.mlnx.springmvc.mybatis.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mlnx.springmvc.mybatis.mapper.TUserMapper;
import com.mlnx.springmvc.mybatis.model.TUser;
import com.mlnx.springmvc.mybatis.po.User;


@Controller
public class HelloController {
 @Autowired
 private TUserMapper userMapper;
 
 private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
 
 @RequestMapping(value="/hello",method=RequestMethod.GET)
 public String hello(User user,HttpServletRequest req){
  req.setAttribute("name", "年后");
  return "hello";
 }
 
 @RequestMapping(value="/hello",method=RequestMethod.POST)
 public String doHello(TUser user){
  logger.debug("name:"+user.getPhone());
  userMapper.insert(user);
  return "redirect:/hello.do";
 }
}