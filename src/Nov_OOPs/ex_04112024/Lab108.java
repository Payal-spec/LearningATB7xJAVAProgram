package Nov_OOPs.ex_04112024;

public class Lab108 {
    public static void main(String[] args) {
        Login1 L1 = new Login1("Poozzoo","000");
        L1.setPword("000",false);
        System.out.println(L1.getPword());
    }
}


class Login1 {

    String Uname;

    public Login1(String uname, String pword) {
        Uname = uname;
        Pword = pword;
    }

    String Pword;

    public String getUname() {
        return Uname;
    }

    public void setUname(String uname) {
        Uname = uname;
    }

    public String getPword() {
        return Pword;
    }

    public void setPword(String pword, Boolean isAuth) {
        if (isAuth) {
            Pword = pword;
        } else {
            System.out.println("Not allowed");




        }
    }
}






