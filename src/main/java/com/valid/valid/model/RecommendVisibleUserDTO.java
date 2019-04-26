package com.valid.valid.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Accessors(chain = true)
@ApiModel(description = "贷款可见用户DTO")
public class RecommendVisibleUserDTO {

    @ApiModelProperty(notes = "可见用户等级id",required = true)
    @NotBlank(message = "可见用户等级id不能为空")
    private String visibleUserLayerNo;

    @ApiModelProperty(notes = "可见用户等级名称",required = true)
    private String visibleUserLayer;

    @ApiModelProperty(notes = "可见用户比例",required = true)
    @NotNull(message = "可见用户比例不能为空")
    @DecimalMax(value = "1", message = "可见用户比例必须小于等于1")
    @DecimalMin(value = "0", message = "可见用户比例必须大于等于0")
    private BigDecimal visibleUserRate;

    @ApiModelProperty(notes = "可见用户数")
    private Integer visibleUserQuqantity;
}
