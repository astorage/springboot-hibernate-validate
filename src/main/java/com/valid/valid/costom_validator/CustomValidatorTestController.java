package com.valid.valid.costom_validator;

import com.valid.valid.model.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
public class CustomValidatorTestController {

    @GetMapping("/CustomValidate/")
    public UserDTO test( @Valid UserDTO userDTO) {
        log.info("userDTO:", userDTO);
        return userDTO;
    }
}
