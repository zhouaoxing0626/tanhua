package com.tanhua.domain.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 测灵魂-问卷列表 vo
 * @Author 18429
 * @create 2021-07-16 21:33
 */
@Data
public class QuestionnaireVo implements Serializable {
    private String id; //问卷编号
    private String name; //问卷名称：初级灵魂题,中级灵魂题,高级灵魂题
    private String cover; //封面
    private String level; //级别 eg:初级,中级,高级
    private Integer star; //星别（例如：2颗星，3颗星，5颗星）
    private List<SoulQuestionVo> questions; //试题
    private Integer isLock; //是否锁住（0解锁，1锁住）
    private String reportId; //最新报告id
}
