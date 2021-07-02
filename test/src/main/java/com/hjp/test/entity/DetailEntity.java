package com.hjp.test.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class DetailEntity implements Serializable {
    private static final long serialVersionUID = -9148528520173897154L;

    private Long id;

    private String detailName;
}
