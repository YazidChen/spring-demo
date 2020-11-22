package com.yazid.demo.spring.springmvc.query;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author Yazid
 * @date 2020/11/22 下午9:58
 */
@Data
public class ValidationQuery {
    @NotNull
    private Long id;
    @NotBlank
    private String name;
    @Size(min = 1, message = "至少有一行数据")
    private List<String> list;
}
