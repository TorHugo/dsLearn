package com.base.project.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResourceType {
    LESSON_ONLY(1L),
    LESSON_TASK(2L),
    FORUM(3L),
    EXTERNAL_LINK(4L);

    private Long id;
}
