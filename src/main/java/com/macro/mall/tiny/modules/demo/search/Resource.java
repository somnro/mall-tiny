package com.macro.mall.tiny.modules.demo.search;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ejlchina.searcher.bean.SearchBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ums_resource")
@ApiModel(value="UmsResource对象", description="后台资源表")
@SearchBean(tables = "ums_resource")//ejlchina的注解，类关联表
public class Resource {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 如果有serialVersionUID，会报异常
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "资源名称")
    private String name;

    @ApiModelProperty(value = "资源URL")
    private String url;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "资源分类ID")
    private Long categoryId;

}
