package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.SaveTeachplanDto;
import com.xuecheng.content.model.dto.TeachPlanDto;

import java.util.List;

/**
 * @description 课程基本信息管理业务接口
 * @author Mr.W
 * @date 2023/3/7 21:25
 * @version 1.0
 */
public interface TeachplanService {

/**
 * @description 查询课程计划树型结构
 * @param courseId  课程id
 * @return List<TeachplanDto>
 * @author Mr.M
 * @date 2022/9/9 11:13
*/
 public List<TeachPlanDto> findTeachplayTree(long courseId);

 /**
  * @description 只在课程计划
  * @param teachplanDto  课程计划信息
  * @return void
  * @author Mr.M
  * @date 2022/9/9 11:13
  */
 public void saveTeachplan(SaveTeachplanDto teachplanDto);

 }