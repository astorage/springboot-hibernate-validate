package com.valid.valid.validtest;

import com.valid.valid.model.BaseDTO;
import com.valid.valid.model.UserGroupDTO;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Range;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.List;

@Validated
@Slf4j
@RestController
public class ValidTestController {

    @GetMapping("/valid/single-string/{param}")
    public String validSingleParam(@PathVariable String param) {
        return param;
    }

    @GetMapping("/valid/single-int")
    public int validGroup3(@Max(value = 40, message = "speedInmph不能超过40") @Min(value = 15, message = "speedInmph必须大于15") int speedInmph){
        return speedInmph;
    }

    @GetMapping("/valid/single-int-range")
    public int validint(@Range(min = 5, max = 20, message = "speedInmph必须在5到20之间") int speedInmph){
        return speedInmph;
    }

    @GetMapping("/valid/single-string-range")
    public String validString(@Range(min = 5, max = 20, message = "speedInmph必须在5到20之间") String speedInmph){
        return speedInmph;
    }

    @GetMapping("/valid/single-string-size")
    public String validStringSize(@Size(min = 5, max = 10, message = "speedInmph必须在5到10之间") String speed){
        return speed;
    }

    @GetMapping("/valid/single-string-regx/email")
    public String validStringRegx(@Pattern(regexp = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$", message = "邮件格式不正确") String email){
        return email;
    }


    @GetMapping("/valid/single-decimal-range")
    public BigDecimal validdecimal(@Range(min = 5, max = 20, message = "speedInmph必须在5到20之间") BigDecimal speedInmph){
        return speedInmph;
    }

    @GetMapping("/valid/single-number1")
    public BigDecimal validnumbersdfdsfsdf(@NotNull(message = "不能为空")
                                           @Digits(integer = 3, fraction = 2, message = "必须是数字，且整数部分最大不能超过3位， 小数部分不能超过2位")
                                           BigDecimal speedInmph){
        log.info("validnumbersdfdsfsdf {}", speedInmph);
        return speedInmph;
    }

    @GetMapping("/valid/single-string/1")
    public String validSingleParam1(@Valid @NotNull String param) {
        return param;
    }

    @PostMapping("/valid/single-model")
    public UserGroupDTO validModelParam(@Valid UserGroupDTO userGroupDTO) {
        log.info("userGroupDTO:{}", userGroupDTO);
        return userGroupDTO;
    }

    public String validGroup1(){
        return null;
    }

    public String validGroup2(){
        return null;
    }
    @PostMapping("/valid/list-model")
    public String validListModel(@RequestBody @Validated  List<UserGroupDTO> list) {
        log.info("userGroupDTO:{}", list);
        return "成功";
    }

    @PostMapping("/valid/model-list-model")
    public String validModelListModel( @RequestBody @Valid BaseDTO<List<UserGroupDTO>> baseDTO) {
        log.info("userGroupDTO:{}", baseDTO);
        return "成功";
    }



}
