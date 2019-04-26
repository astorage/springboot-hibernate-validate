package com.valid.valid.model;

import com.valid.valid.costom_validator.MyCheckAnnotation;
import com.valid.valid.costom_validator.MyCheckEnum;
import lombok.Data;

@Data
public class UserDTO {

    @MyCheckAnnotation(value = MyCheckEnum.UPPER, message = "用户名必须大写")
    private String userName;

}
