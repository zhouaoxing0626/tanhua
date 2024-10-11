package com.tanhua.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SoulQuestionVo {
    private String id;
    private String question; //问题
    List<SoulQuestionOptionVo> options; //选项
}