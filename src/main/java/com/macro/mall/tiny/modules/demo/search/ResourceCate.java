package com.macro.mall.tiny.modules.demo.search;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ejlchina.searcher.bean.DbField;
import com.ejlchina.searcher.bean.SearchBean;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@SearchBean(tables = "ums_resource_category")//ejlchina的注解，类关联表
public class ResourceCate {
    @DbField(value = "id")
    private Long id;

    /**
     * 如果有serialVersionUID，会报异常
     */

//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")//无效
    @DbField(value = "create_time")
    private String createTime;

    @DbField(value = "name")
    private String name;

    @DbField(value = "sort")
    private String sort;
}
