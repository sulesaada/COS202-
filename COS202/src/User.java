public abstract class User implements Authenticable {
    private String email;
    private String password;
    public String getPassword(){
        return password;

    }
    public void setPassword(String password){
        this.password=password;
    }
    public boolean authenticate(String email, String password){
        return false;
    }

    public String OTP() {
        return null;
    }
    @Override
    public String password(){
        return null;
    }
    @Override
    public String passkey(){
        return null;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    abstract String getPermission();
}
