public interface Authenticable {
    boolean authenticate();
    String OTP();
    String password();
    String passkey();
}
