import java.util.ArrayList;

public class NhanVien {
    private String maNV;
    private String hoten;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoten, double luong) {
        this.maNV = maNV;
        this.hoten = hoten;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double getThuNhap() {
        return luong-getThueTN();
    }

    public double getThueTN() {
        if(luong<90){
            return 0;
        }
        else if (luong>90 && luong<150){
            return luong*10/100;
        }
        else {
            return luong*12/100;
        }
    }

    public String inraMH() {
        return "maNV='" + maNV + '\'' + ", hoten='" + hoten + '\'' + ", Thu nhap=" + getThuNhap();
    }
}
