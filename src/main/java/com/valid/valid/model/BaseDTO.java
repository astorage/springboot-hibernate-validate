package com.valid.valid.model;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class BaseDTO<T> {
    @Valid
//    @NotNull(message = "不能为null")
//    @Size(min = 1, message = "至少有一个元素")
    T data;
}
