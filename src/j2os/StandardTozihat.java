package j2os;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
public @interface StandardTozihat {
    public String developerName() default "Nadarad";
    public String tarikhTolid() default "Malom nist";
    public boolean checkShode() default false;
    String value();
}
