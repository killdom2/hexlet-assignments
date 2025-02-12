package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class Validator {
    public static List<String> validate(Address address) {

        List<String> nullFields = new ArrayList<>();

        Field[] fields = address.getClass().getDeclaredFields();

        try {
            for (Field field : fields) {
                field.setAccessible(true);
                var nullField = field.get(address);
                var annotation = field.getAnnotation(NotNull.class);
                if (nullField == null && annotation != null) {
                    nullFields.add(field.getName());
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return nullFields;
    }
}

// END
