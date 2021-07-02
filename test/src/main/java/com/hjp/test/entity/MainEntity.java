package com.hjp.test.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Accessors(chain = true)
public class MainEntity implements Serializable {
    private static final long serialVersionUID = 3417988401344336988L;

    private Long id;

    @NotEmpty(message = "名称不能为空")
    private String name;

}
