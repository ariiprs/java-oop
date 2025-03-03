package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.ValidationException;
import programmer.zaman.now.util.ValidationUtil;

public class ValidationApp {

    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null, "rahasia");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        }catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid dengan pesan : " + exception.getMessage());
        }finally {
            System.out.println("Selalu di eksekusi");
        }

        LoginRequest loginRequest1 = new LoginRequest("", "");
        ValidationUtil.validateRuntime(loginRequest1);

    }
}
