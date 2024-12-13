package Dec.ex_08122024_Wrapper.ex_13122024;


import javax.print.attribute.standard.Severity;

public enum SEVERITY {
    Low("low"),
    Medium("medium"),
    High("high");


    private String Degree;

    SEVERITY(String Degree) {
        this.Degree = Degree;
    }

    public String getDegree() {
        return Degree;
    }
}

