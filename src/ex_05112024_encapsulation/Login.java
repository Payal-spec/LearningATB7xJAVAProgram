package ex_05112024_encapsulation;

public class Login {
    private String Username;
   private String Password;

    public Login(String username, String password) {
        Username = username;
        Password = password;
    }

    public String getPassword() {
        return Password;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getUsername() {
        return Username;
    }
}
