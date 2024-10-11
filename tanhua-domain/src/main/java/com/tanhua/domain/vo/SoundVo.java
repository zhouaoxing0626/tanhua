package com.tanhua.domain.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author 18429
 * @create 2021-07-17 11:36
 */
@Data
public class SoundVo implements Serializable {

    private Integer id; //用户id
    private String nickname; //昵称
    private String avatar; //用户头像
    private String gender; //性别
    private Integer age; //年龄

    private String soundUrl;//声音地址

    private Integer remainingTimes;//接受消息剩余次数
}
