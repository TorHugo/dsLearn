package com.base.project.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DeliverStatus {

    PENDING(1L),
    ACCEPTED(2L),
    REJECTED(3L);

    private final Long id;
}
