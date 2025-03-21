import java.util.*;

public class seven {

    public static int generateOTP() {
        return (int)(100000 + Math.random() * 900000);
    }

    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) {
            set.add(otp);
        }
        return set.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        boolean unique = areOTPsUnique(otps);
        System.out.println("Are all OTPs unique? " + unique);
    }
}
