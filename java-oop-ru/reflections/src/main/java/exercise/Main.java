package exercise;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Address address = new Address(null, "London", "1-st street", "7", "2");
        List<String> notValidFields = Validator.validate(address);
        System.out.println(notValidFields); // => [country]

        Address address2 = new Address("England", null, null, "7", "2");
        List<String> notValidFields2 = Validator.validate(address2);
        System.out.println(notValidFields2); // => [city, street]

        Address address3 = new Address("England", "London", "street", "7", null);
        List<String> notValidFields3 = Validator.validate(address3);
        System.out.println(notValidFields3); // => []
    }
}
