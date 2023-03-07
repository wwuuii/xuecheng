package com.xuecheng.content.model.dto;

import com.xuecheng.content.model.po.Teachplan;
import com.xuecheng.content.model.po.TeachplanMedia;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @description 课程计划树型结构dto
 * @author Mr.W
 * @date 2023/3/7 20:21
 * @version 1.0
 */
@Data
@ToString
public class TeachPlanDto extends Teachplan {

  //课程计划关联的媒资信息
  TeachplanMedia teachplanMedia;

  //子结点
  List<TeachPlanDto> teachPlanTreeNodes;

}