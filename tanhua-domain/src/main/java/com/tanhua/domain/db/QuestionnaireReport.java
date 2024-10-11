package com.tanhua.domain.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户答题结果
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionnaireReport extends BasePojo implements Serializable {

    private Long id;
    private Long userId; //用户id
    private Long questionnaireId; //问卷id
    private Long resultId; //结果id
}