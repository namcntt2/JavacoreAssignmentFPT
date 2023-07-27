public class TruongPhong extends NhanVien{
    private double trachNhiem;

    public TruongPhong() {
    }

    public TruongPhong(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong(String maNV, String hoten, double luong, double trachNhiem) {
        super(maNV, hoten, luong);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public double getThuNhap(){
        return getLuong() + trachNhiem - getThueTN();
    }
}
