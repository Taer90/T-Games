package data;

import java.util.EnumSet;
import java.util.Set;

public enum OtpForm {
    OTP1("1"),
    OTP2("2"),
    OTP3("3"),
    OTP4("4"),
    OTP5("5"),
    OTP6("6");

    private String otp;

    OtpForm(String otp){
        this.otp = otp;
    }
    public String getOtp(){
        return otp;
    }

    public static final Set<OtpForm> ALL_OTP = EnumSet.of(
            OTP1, OTP2, OTP3, OTP4, OTP5, OTP6
    );

}
