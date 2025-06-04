public abstract class User implements Authenticable {
    private String email;
    private String password;
    public String getPassword(){
        return password;

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

    abstract String getPermission();
}
