package com.valid.valid.group_validate;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class GroupValidateTestController {

    @GetMapping("/group-validate/person")
    public Person getPerson(@Valid Person person) {
        return person;
    }


    @PutMapping("/group-validate/person")
    public Person putPerson(@Validated(Person.GroupA.class) Person person) {

        return person;
    }
}
