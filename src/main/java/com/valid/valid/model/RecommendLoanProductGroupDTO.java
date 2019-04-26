package com.valid.valid.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Accessors(chain = true)
@ApiModel(description = "贷款配置DTO")
public class RecommendLoanProductGroupDTO{

    @ApiModelProperty(notes = "贷款等级no")
    @NotBlank(message = "贷款等级no不能为空")
    private String loanRankNo;

    @ApiModelProperty(notes = "贷款等级",required = true)
    private String loanRank;

    @ApiModelProperty(notes = "是否授信",required = true)
    @NotNull(message = "是否授信不能为空")
    private Boolean isCredited;

    @ApiModelProperty(notes = "可见用户")
    @Valid
    @NotNull(message = "可见用户不能为null")
    @Size(min = 1, message = "贷款必须有可见用户")
    private List<RecommendVisibleUserDTO> visibleUsers;

    @ApiModelProperty(notes = "可见用户数")
    private Integer visibleUserSum;


}
