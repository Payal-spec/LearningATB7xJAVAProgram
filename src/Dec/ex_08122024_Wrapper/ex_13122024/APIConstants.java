package Dec.ex_08122024_Wrapper.ex_13122024;

public enum APIConstants {
    Login("https://abc.com"),
    Dashboard("https://abc.com/dashboard"),
    Logout("https://abc.com/logout");

    private String name;

    public String getName() {
        return name;
    }

    APIConstants(String name){
        this.name=name;
    }
}
