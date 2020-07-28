package CodeDemo06;

public class Baozi {
    private String pi;
    private String xian;
    private boolean flag = false;

    public Baozi(String pi, String xian, boolean flag) {
        this.pi = pi;
        this.xian = xian;
        this.flag = flag;
    }

    public Baozi() {
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
