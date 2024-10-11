package com.tanhua.domain.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户对应问卷锁表
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionUserLock extends BasePojo{
    private long id;
    private long userId;//用户id
    private long questionnaireId;//问卷id
    private Integer isLock;//对应锁状态
}