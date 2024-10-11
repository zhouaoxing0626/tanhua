package com.tanhua.domain.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 问题选项得分
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SoulQuestionOption extends BasePojo{
    private Long id;
    private String content; //选项内容
    private String medias;
    private Long questionId; //问题id
    private String score; //选项得分
}