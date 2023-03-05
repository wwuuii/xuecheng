package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/**
* @author Mr.W
* @description: 课程基本信息管理业务接口
* @date 2023/3/5 17:48
*/
public interface CourseBaseInfoService  {

 /**
  * @description 课程查询接口
  * @param pageParams 分页参数
  * @param queryCourseParamsDto 条件条件
  * @return com.xuecheng.base.model.PageResult<com.xuecheng.content.model.po.CourseBase>
  * @author Mr.M
  * @date 2022/9/6 21:44
 */
  PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);

 }