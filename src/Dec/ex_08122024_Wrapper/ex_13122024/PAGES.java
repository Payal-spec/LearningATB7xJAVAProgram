package Dec.ex_08122024_Wrapper.ex_13122024;

public enum PAGES {
    Login(1),
    Dashboard(2),
    Logout(3);


    private int pagenumber;

    public int getPagenumber() {
        return pagenumber;
    }

    PAGES (int pagenumber){
        this.pagenumber=pagenumber;
    }

}
