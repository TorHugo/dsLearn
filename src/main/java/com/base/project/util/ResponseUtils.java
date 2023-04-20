package com.base.project.util;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
@Data
public class ResponseUtils {

    public static HttpStatus created = HttpStatus.CREATED;
    public static HttpStatus successful = HttpStatus.OK;
    public static HttpStatus badRequest = HttpStatus.BAD_REQUEST;
    public static HttpStatus noContent = HttpStatus.NO_CONTENT;
    public static HttpStatus internalError = HttpStatus.INTERNAL_SERVER_ERROR;
}
