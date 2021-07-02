package com.hjp.common.utils;

import com.hjp.common.vo.Result;

public class ResultUtil {

    private static final int SUCCESS_CODE = 200;

    private static final int FAIL_CODE = 0;

    private static final String SUCCESS_MSG = "success";

    public static Result success (Object data) {
        return new Result(SUCCESS_CODE, SUCCESS_MSG, data);
    }

    public static Result success () {
        return new Result(SUCCESS_CODE, SUCCESS_MSG);
    }

    public static Result fail (String msg) {
        return new Result(FAIL_CODE, msg);
    }
}
