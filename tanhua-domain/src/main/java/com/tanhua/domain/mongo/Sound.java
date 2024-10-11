package com.tanhua.domain.mongo;

import com.tanhua.domain.db.BasePojo;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * 声音表
 * @Author 18429
 * @create 2021-07-17 11:27
 */
@Data
@Document(collection = "Sound")
public class Sound extends BasePojo implements Serializable {
    private Long id;
    private Long userId;//用户id
    private String soundUrl;//声音地址
}
