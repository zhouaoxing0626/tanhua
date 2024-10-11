package com.tanhua.domain.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 问卷对应的题干
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SoulQuestion extends BasePojo{
    private Long id;
    private String stem; //题干
    private Long questionnaireId; //问卷id
}