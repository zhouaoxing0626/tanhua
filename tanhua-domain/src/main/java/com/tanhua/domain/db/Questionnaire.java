package com.tanhua.domain.db;

import lombok.Data;

import java.io.Serializable;

/**
 * 问卷表
 * @Author 18429
 * @create 2021-07-17 11:13
 */
@Data
public class Questionnaire extends BasePojo implements Serializable  {
    private Long id;
    private Integer level; //级别 eg:初级,中级,高级
    private String name; //问卷名称
    private String cover; //封面
    private Integer star; //星别（例如：2颗星，3颗星，5颗星）
}
