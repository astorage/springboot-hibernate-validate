package com.valid.valid.group_validate;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
public class GroupValidateTest2Controller {

    @GetMapping("/group-validate2/personList")
    public List<Person> getPerson( @Valid @RequestBody List<Person> personList) {
        return personList;
    }



    @GetMapping("/group-validate2/person")
    public Person checkPersonGroupSequence( @Validated(GroupOrder.class) Person person) {
        return person;
    }





}
