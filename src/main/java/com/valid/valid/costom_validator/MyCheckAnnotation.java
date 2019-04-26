package com.valid.valid.costom_validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target( { ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MyCheckValidator.class)
@Documented
public @interface MyCheckAnnotation {

    Class<?>[] groups() default {};

    MyCheckEnum value();

    Class<? extends Payload>[] payload() default {};

    String message() default "";
}
