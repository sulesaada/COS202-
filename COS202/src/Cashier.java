public abstract class Cashier extends User {
    private String email;
    private String password;
    public String getEmail(){
        return email;
    }
    String getPermissions(){
        return null;
    }
}
