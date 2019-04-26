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

/**
 * 用户分层配置DTO
 */
@Data
@Accessors(chain = true)
@ApiModel(description = "用户分层配置DTO")
public class RecommendUserGroupDTO {

    /**
     * 用户层级no
     */
    @ApiModelProperty(notes = "用户层级no", required = true)
    @NotBlank(message = "用户层级no不能为空")
    private String userLayerNo;
    /**
     * 用户层级
     */
    @ApiModelProperty(notes = "用户层级")
    private String userLayer;
    /**
     * 是否授信
     */
    @ApiModelProperty(notes = "是否授信")
    private Boolean isCredited;
    /**
     * 最小模型分
     */
    @ApiModelProperty(notes = "最小模型分", required = true)
    @NotNull(message = "最小模型分不能为空")
    @DecimalMax(value = "1", message = "最小模型分必须小于等于1")
    @DecimalMin(value = "0", message = "最小模型分必须大于等于0")
    private BigDecimal minModelScore;
    /**
     * 最大模型分
     */
    @ApiModelProperty(notes = "最大模型分", required = true)
    @NotNull(message = "最大模型分不能为空")
    @DecimalMax(value = "1", message = "最大模型分必须小于等于1")
    @DecimalMin(value = "0", message = "最大模型分必须大于等于0")
    private BigDecimal maxModelScore;
    /**
     * 用户数
     */
    @ApiModelProperty(notes = "用户数")
    private Integer userQuantity;
    /**
     * 占比(在模型分区间的人数占总人数的比例)
     */
    @ApiModelProperty(notes = "占比")
    private Double rate;

}
