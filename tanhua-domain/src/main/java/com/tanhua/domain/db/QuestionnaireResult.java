package com.tanhua.domain.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 灵魂测试结果表
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionnaireResult extends BasePojo{

    private Long id;

    private Long questionnaireId; //问卷id
    private String scope; //结果得分范围
    private String cover; //结果封面图
    private String content; //结果的文字描述

    private String extroversion; //外向得分
    private String judgement; //判断得分
    private String abstraction; //抽象得分
    private String rationality; //理性得分

}