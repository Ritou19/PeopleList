package ch.hearc.ig.odi2.peoplelist.presentation.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author steven.habegger
 */
public class UniqueValidator implements ConstraintValidator<Unique, String> {

    @Override
    public void initialize(Unique constraintAnnotation) {
        
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        String str = value.toString();
        return true;
    }
    
}
