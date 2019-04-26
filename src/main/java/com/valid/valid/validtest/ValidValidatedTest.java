package com.valid.valid.validtest;

import com.valid.valid.model.UserGroupDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.List;

@Slf4j
@RestController
public class ValidValidatedTest {

    @GetMapping("/validatedValid/testValid/objectlist")
    public List<UserGroupDTO> testValidListObject (
            @Size(min = 1, message = "nameList不能为空")
            @Valid
            @RequestBody
                    List<UserGroupDTO> userGroupDTOList) {
        log.info("name: {}", userGroupDTOList);
        return userGroupDTOList;
    }

    @GetMapping("/validatedValid/testValidated/objectlist")
    public List<UserGroupDTO> testValidatedListObject (
            @Size(min = 1, message = "nameList不能为空")
            @Validated
            @RequestBody
                    List<UserGroupDTO> userGroupDTOList) {
        log.info("name: {}", userGroupDTOList);
        return userGroupDTOList;
    }
}
