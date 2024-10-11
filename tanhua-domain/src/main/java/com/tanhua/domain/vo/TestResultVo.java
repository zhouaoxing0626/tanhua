package com.tanhua.domain.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 测灵魂-查看结果（学生实战）
 * @Author 18429
 * @create 2021-07-16 21:12
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestResultVo {
    private String conclusion;
    private String cover;
    private List<Dimensions> dimensions; //维度
    private List<SimilarYou> similarYou; //与你相似
}
