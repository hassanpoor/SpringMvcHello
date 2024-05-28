package org.example.formTag;

import javax.validation.Constraint;
import java.lang.annotation.*;

@Constraint(validatedBy = OperationSyestemValidation.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface OperationSystemCheck {
    public String value() default "os";
    public String message() default "must be end by os";
}
