package com.tanhua.domain.db;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 接收语音状态表
 * @Author 18429
 * @create 2021-07-16 20:07
 */
@Data
public class Status implements Serializable {
    private Long id;
    private Long userId;//用户id
    private Long remainingTimes;//接受消息剩余次数
    private Long remainingSend;//发送消息剩余次数
    private Date created;//创建时间
}
