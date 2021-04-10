package com.tokaku.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Course {
    private int courseId;
    private String courseName;
    private String type;
}
