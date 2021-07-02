package com.hjp.test.dto;

import com.hjp.test.entity.DetailEntity;
import com.hjp.test.entity.MainEntity;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Data
@Accessors(chain = true)
public class SaveDTO implements Serializable {
    private static final long serialVersionUID = 2786910256096097131L;

    @NotNull(message = "主表信息不能为null")
    private MainEntity main;

    @NotNull
    private List<DetailEntity> details;

}
