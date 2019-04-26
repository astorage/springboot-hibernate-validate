package com.valid.valid.model;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
public class RecommendUpdateDTO<T> {
    @NotNull
    @Valid
    T data;
}
