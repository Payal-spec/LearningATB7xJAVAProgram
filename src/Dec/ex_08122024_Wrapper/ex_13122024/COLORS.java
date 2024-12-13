package Dec.ex_08122024_Wrapper.ex_13122024;

import java.sql.Struct;

public enum COLORS {
    RED("ff0000"),
    Black ("iiff00");

    public String getHexvalue() {
        return hexvalue;
    }

    private String hexvalue;
COLORS (String hexvalue){
    this.hexvalue = hexvalue;
}


}
