package com.valid.valid.costom_validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyCheckValidator implements ConstraintValidator<MyCheckAnnotation, String> {

    private MyCheckEnum myCheckEnum;
    @Override
    public void initialize(MyCheckAnnotation constraintAnnotation) {
        myCheckEnum = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }

        if (myCheckEnum == MyCheckEnum.UPPER) {
            return value.equals(value.toUpperCase());
        } else {
            return value.equals(value.toLowerCase());
        }
    }
}
