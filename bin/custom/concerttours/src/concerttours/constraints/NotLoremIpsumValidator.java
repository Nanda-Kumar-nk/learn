package concerttours.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotLoremIpsumValidator implements ConstraintValidator<NotLoremIpsum, String> {
    @Override
    public void initialize(final NotLoremIpsum constraintAnnotation) {
        // empty
    }

    @Override
    public boolean isValid(final String value, final ConstraintValidatorContext context) {
        if (value == null || value.isEmpty()) {
            return true;
        }
        boolean isValidFlag = !value.toLowerCase().startsWith("lorem ipsum");
        System.out.println(isValidFlag);
        return isValidFlag;
    }
}