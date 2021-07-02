package com.hjp.test.config;

import com.hjp.common.utils.ResultUtil;
import com.hjp.common.vo.Result;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = BindException.class)
    public Result handlerBindException(BindException exception) {
        return ResultUtil.fail("参数校验失败：" + exception.getMessage());
    }


}
