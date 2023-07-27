public class TiepThi extends NhanVien{
    private double doanhSo;
    private double hueHong;

    public TiepThi() {
    }

    public TiepThi(double doanhSo, double hueHong) {
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public TiepThi(String maNV, String hoten, double luong, double doanhSo, double hueHong) {
        super(maNV, hoten, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }

    public double getThuNhap(){
        return getLuong() + doanhSo + hueHong - getThueTN();
    }
}
