package ch.hearc.ig.odi2.peoplelist.presentation.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Payload;

/**
 *
 * @author steven.habegger
 */
@Documented
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Unique {

    String message() default "Il existe déjà une personne avec ce nom, ce prénom et cette date de naissance";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
