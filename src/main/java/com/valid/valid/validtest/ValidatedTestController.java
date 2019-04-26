package com.valid.valid.validtest;

import com.valid.valid.model.UserGroupDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Validated
@Slf4j
@RestController
public class ValidatedTestController {

    @GetMapping("/validated/test/string")
    public String testValidated (@NotBlank(message = "name不能为空") String name) {
        log.info("name: {}", name);
        return name;
    }

    @GetMapping("/validated/test/stringlist")
    public List<String> testValidatedList (@Size(min = 1, message = "nameList不能为空")
                                           @RequestParam("nameList")
                                           List<String> nameList) {
        log.info("name: {}", nameList);
        return nameList;
    }

    @GetMapping("/validated/test/objectlist")
    public List<UserGroupDTO> testValidatedListObject (
                                           @Size(min = 1, message = "nameList不能为空")
                                           @Validated
                                           @RequestBody
                                                   List<UserGroupDTO> userGroupDTOList) {
        log.info("name: {}", userGroupDTOList);
        return userGroupDTOList;
    }



    @GetMapping("/validated/testValid/objectlist")
    public List<UserGroupDTO> testValidListObject (
            @Size(min = 1, message = "nameList不能为空")
            @Valid
            @RequestBody
                    List<UserGroupDTO> userGroupDTOList) {
        log.info("name: {}", userGroupDTOList);
        return userGroupDTOList;
    }

}
