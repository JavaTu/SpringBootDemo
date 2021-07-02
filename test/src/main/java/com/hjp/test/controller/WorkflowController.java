package com.hjp.test.controller;

import com.hjp.common.utils.ResultUtil;
import com.hjp.common.vo.Result;
import com.hjp.test.dto.SaveDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workflow")
public class WorkflowController {

    @RequestMapping("/saveWorkflow")
    public Result saveWorkflow(@Validated SaveDTO dto) {
        System.out.println("入参：" + dto);
        return ResultUtil.success();
    }
}
