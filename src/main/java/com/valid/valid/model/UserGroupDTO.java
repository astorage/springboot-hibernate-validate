package com.valid.valid.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 用户分层配置DTO
 */
@Data
@Accessors(chain = true)
@ApiModel(description = "用户分层配置DTO")
public class UserGroupDTO{
    @ApiModelProperty(notes = "id")
    private Long id;
    /**
     * 用户层级no
     */
    @ApiModelProperty(notes = "用户层级no")
    @NotBlank(message = "用户层级不能为空")
    private String userLayerNo;
    /**
     * 用户层级
     */
    @ApiModelProperty(notes = "用户层级", required = true)
    @NotBlank(message = "用户层级不能为空")
    private String userLayer;
    /**
     * 是否授信
     */
    @ApiModelProperty(notes = "是否授信", required = true)
    @NotNull(message = "是否授信不能为null")
    private Boolean isCredited;
    /**
     * 最小模型分
     */
    @ApiModelProperty(notes = "最小模型分", required = true)
    @DecimalMax(value = "1", message = "最小模型分不能大于1")
    @DecimalMin(value = "0", message = "最小模型分不能小于0")
    private BigDecimal minModelScore;
    /**
     * 最大模型分
     */
    @ApiModelProperty(notes = "最大模型分", required = true)
    @DecimalMax(value = "1", message = "最大模型分不能大于1")
    @DecimalMin(value = "0", message = "最大模型分不能小于0")
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
    /**
     * 创建人
     */
    @ApiModelProperty(notes = "创建人")
    private String createdBy;
    /**
     * 创建时间
     */
    @ApiModelProperty(notes = "创建时间")
    private LocalDateTime createdDate;
    /**
     * 修改人
     */
    @ApiModelProperty(notes = "修改人")
    private String lastModifiedBy;
    /**
     * 修改时间
     */
    @ApiModelProperty(notes = "修改时间")
    private LocalDateTime lastModifiedDate;
    /**
     * 是否删除
     */
    @ApiModelProperty(notes = "是否删除")
    private Integer deleted;
}
