package org.example.formTag;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OperationSyestemValidation implements ConstraintValidator<OperationSystemCheck,String> {

    private String osPostFix;
    @Override
    public void initialize(OperationSystemCheck constraintAnnotation) {
      osPostFix=constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(!s.endsWith(osPostFix)){
            return false;
        }
        return true;
    }
}
