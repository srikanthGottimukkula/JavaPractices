public class Student {

    private int sno;

    private String sName;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Student(int sno, String sName) {
        this.sno = sno;
        this.sName = sName;
    }


}

