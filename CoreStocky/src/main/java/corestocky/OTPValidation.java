package corestocky;

import java.util.Scanner;

public class OTPValidation {

    private static final int MAX_ATTEMPTS = 3; // Maximum OTP validation attempts
    private static final String CORRECT_OTP = "123456"; // The correct OTP

    private int attempts = 0;

    public boolean validateOTP(String userOTP) {
        if (userOTP.equals(CORRECT_OTP)) {
            System.out.println("OTP is valid. Access granted.");
            return true;
        } else {
            attempts++;
            System.out.println("Invalid OTP. Attempts remaining: " + (MAX_ATTEMPTS - attempts));
            return false;
        }
    }

    public boolean hasExceededLimit() {
        return attempts >= MAX_ATTEMPTS;// 5>=3
    }

    public static void main(String[] args) {
        OTPValidation otpValidator = new OTPValidation();
        Scanner scanner = new Scanner(System.in);

        while (!otpValidator.hasExceededLimit()) {
            System.out.print("Enter OTP: ");
            String userOTP = scanner.nextLine();

            if (otpValidator.validateOTP(userOTP)) {
                break;
            }
        }

        if (otpValidator.hasExceededLimit()) {
            System.out.println("Maximum attempts exceeded. Account locked.");
            // You can implement account locking or other actions here.
        }

        scanner.close();
    }
}

