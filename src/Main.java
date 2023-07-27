import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static ArrayList<NhanVien> listNV = new ArrayList<>();
    static ArrayList<TiepThi> listNVTT = new ArrayList<>();
    static ArrayList<TruongPhong> listNVTP = new ArrayList<>();
    static ArrayList <NhanVien> listNvTongHop = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

//    10. Fake Data
    public static void fakeData(){
        NhanVien nv1 = new NhanVien("1","Long",200);
        NhanVien nv2 = new NhanVien("2","Thảo",90);
        NhanVien nv3 = new NhanVien("3","Nam",100);
        NhanVien nv4 = new NhanVien("4","Hoa",130);
        listNV.add(nv1);
        listNV.add(nv2);
        listNV.add(nv3);
        listNV.add(nv4);
        TiepThi tt1 = new TiepThi("5","Trong",320,15,10);
        TiepThi tt2 = new TiepThi("6","Thanh",180,8,50);
        TiepThi tt3 = new TiepThi("7","THuong",100,70,20);
        listNVTT.add(tt1);
        listNVTT.add(tt2);
        listNVTT.add(tt3);
        TruongPhong tp1 = new TruongPhong("8","Trang",100,10);
        TruongPhong tp2 = new TruongPhong("9","Trung",100,12);
        listNVTP.add(tp1);
        listNVTP.add(tp2);
        truyenPrameter();
    }

//    1. Thêm danh sách Nhân Viên
    public static void themNhanVien(){
        //Khai bao
        String maNhanVien;
        String hoTenNV;
        double luong;
        double doanhSo;
        double hueHong;
        double trachNhiem;

        System.out.println("Chon loai nhan Vien muon them: ");
        System.out.println("1. Nhan vien hanh chinh");
        System.out.println("2. Nhan vien tiep thi");
        System.out.println("3. Nhaan vien truong phong");
        System.out.print("Ban muon chon loai Nhan Vien nao: ");
        int loaiNV = Integer.valueOf(input.nextLine());
        System.out.print("So luong Nhan Vien ban muon them: ");
        int sl = Integer.valueOf(input.nextLine());
        switch (loaiNV){
            case 1:
                for (int i = 0 ; i < sl ; i++){
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Nhan Vien hanh chinh " + (i+1));
                    System.out.print("Ma Nhan Vien: ");
                    maNhanVien = String.valueOf( input.nextLine());
                    System.out.print("Ho ten Nhan Vien: ");
                    hoTenNV = String.valueOf( input.nextLine());
                    System.out.print("Luong: ");
                    luong = input.nextDouble();
                    input.nextLine();
                    NhanVien nv = new NhanVien(maNhanVien,hoTenNV,luong);
                    listNV.add(nv);
                }
                break;
            case 2:
                for (int i = 0 ; i < sl ; i++){
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Nhan Vien Tiep Thi " + (i+1));
                    System.out.print("Ma Nhan Vien: ");
                    maNhanVien = String.valueOf( input.nextLine());
                    System.out.print("Ho ten Nhan Vien: ");
                    hoTenNV = String.valueOf( input.nextLine());
                    System.out.print("Luong: ");
                    luong = input.nextDouble();
                    System.out.print("Doanh so: ");
                    doanhSo = input.nextDouble();
                    System.out.print("Hue hong: ");
                    hueHong = input.nextDouble();
                    input.nextLine();
                    TiepThi nv = new TiepThi(maNhanVien,hoTenNV,luong,doanhSo,hueHong);
                    listNVTT.add(nv);
                }
            case 3:
                for (int i = 0 ; i < sl ; i++){
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Nhan Vien Truong Phong " + (i+1));
                    System.out.print("Ma Nhan Vien: ");
                    maNhanVien = String.valueOf( input.nextLine());
                    System.out.print("Ho ten Nhan Vien: ");
                    hoTenNV = String.valueOf( input.nextLine());
                    System.out.print("Luong: ");
                    luong = input.nextDouble();
                    System.out.print("Trach nhiem: ");
                    trachNhiem = input.nextDouble();
                    input.nextLine();
                    TruongPhong nv = new TruongPhong(maNhanVien,hoTenNV,luong,trachNhiem);
                    listNVTP.add(nv);
                }
        }
    }

//    Truyen thong tin nhan vien, tiep thi, truong phong vao list tong hop
    public static void truyenPrameter(){
        for(NhanVien nhanVien: listNV){
            listNvTongHop.add(nhanVien);
        }
        for(TiepThi tiepThi: listNVTT){
            listNvTongHop.add(tiepThi);
        }
        for(TruongPhong truongPhong: listNVTP){
            listNvTongHop.add(truongPhong);
        }
        for(NhanVien nhanVien: listNvTongHop){
            nhanVien.inraMH();
        }
    }

//    2. Xuất danh sách Nhân Viên
    public static void xuatNhanVien(){
        truyenPrameter();
        for (NhanVien x:listNvTongHop){
            System.out.println(x.inraMH());
        }
    }

//    3 Tìm nhân viên theo Mã nhân Viên
    public static void timNVTheoMaNV(){
        System.out.print("Nhap Ma Nhan Vien muon tim kiem: ");
        String maNV = String.valueOf(input.nextLine());
        int i = 1;
        for (NhanVien x :listNV){
            if(maNV.equals(x.getMaNV())){
                System.out.println("Nhan vien "+i+":");
                System.out.println(x.inraMH());
                i++;
            }
        }
    }

//    4. Xoá Nhn Viên theo Mã Nhân Viên
    public static void xoaNVtheoMaNV(){
        System.out.print("Nhap Ma Nhan Vien muon xoa: ");
        String maNV = String.valueOf(input.nextLine());
        int i = 1;
        for (NhanVien x :listNV){
            if(maNV.equals(x.getMaNV())){
                listNV.remove(x);
                System.out.println("Nhan vien "+i+":");
                System.out.println(x.inraMH());
                i++;
            }
        }
    }

//    5. Cập nhật thông tin theo Mã Nhân Viên
    public static void capNhatNVtheoMaNV(){
        System.out.print("Nhap Ma Nhan Vien muon cap nhat: ");
        String maNV = String.valueOf(input.nextLine());
        for (NhanVien x :listNV){
            if(maNV.equals(x.getMaNV())){
                System.out.println("Thong tin nhan vien can cap nhat:");
                System.out.println("Cap nhat Nhan Vien co ma NV :" + maNV);
                System.out.print("Ho ten NV: ");
                String htNV = String.valueOf(input.nextLine());
                x.setHoten(htNV);
                System.out.print("Muc luong cua ho: ");
                double lNV = Double.valueOf(input.nextLine());
                x.setLuong(lNV);
            }
        }
    }

//    6. Tìm Nhân Viên theo khoảng Lương
    public static void timNVtheoLuong(){
        System.out.println("Danh sach Nhan Vien theo khoang luong: ");
        System.out.print("Luong bat dau: ");
        double luongx = Double.valueOf(input.nextLine());
        System.out.print("Luong ket thuc: ");
        double luongy = Double.valueOf(input.nextLine());
        int i = 1;
        for (NhanVien x :listNV){
            if (x.getLuong()>luongx && x.getLuong()<luongy) {
                System.out.println("Nhan vien "+i+":");
                System.out.print(x.inraMH());
                System.out.println("luong NV");
                System.out.println(x.getLuong());
                i++;
            }
        }
    }

//    7. Sắp xếp Nhân Viên theo Họ và Tên
    public static void sapXepTheoName(){
        Collections.sort(listNV, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getHoten().compareToIgnoreCase(o2.getHoten());
            }
        });
        int i = 0;
        for (NhanVien x :listNV){
            System.out.println("Nhan vien "+ ++i +":");
            System.out.println(x.inraMH());
        }
    }

//    8. Sap xep nhan vien theo thu nhap
    public static void sapXepTheoThuNhap(){
        Collections.sort(listNvTongHop, Comparator.comparingDouble(NhanVien::getThuNhap).reversed());
        int i = 0;
        for (NhanVien x :listNvTongHop){
            System.out.println("Nhan vien "+ ++i +":");
            System.out.println(x.inraMH());
        }
    }
//    9. Xuat 5 thang Nhan Vien co thu nhap cao nhat
    public static void xuat5NhanVienCoThuNhapCaoNhat(){
        Collections.sort(listNvTongHop, Comparator.comparingDouble(NhanVien::getThuNhap).reversed());
        for (int i = 0 ; i < 5 ; i ++ ){
            System.out.println("Mã nhân viên : " +listNvTongHop.get(i).getMaNV() + "Tên : "
                            + listNvTongHop.get(i).getHoten() + "Thu nhap: "
                            + listNvTongHop.get(i).getThuNhap());
        }
    }

    public static void menu(){
        int chon = 0;
        do{
            System.out.println("=================================================================");
            System.out.println("+ Nhap yeu cau ban muon thuc hien: ( 0 --> 10 )                 +");
            System.out.println("+ Y1. Nhap danh sach Nhan Vien tu ban phim.                     +");
            System.out.println("+ Y2. Xuat danh sach Nhan Vien ra man hinh.                     +");
            System.out.println("+ Y3. Tim va hien thi Nhan Vien theo ma nhap tu ban phim.       +");
            System.out.println("+ Y4. Xoa Nhan Vien theo ma nhap tu ban phim.                   +");
            System.out.println("+ Y5. Cap nhat thong tin Nhan Vien theo ma nhap tu ban phim.    +");
            System.out.println("+ Y6. Tim cac Nhan Vien theo khoang luong nhap tu ban phim      +");
            System.out.println("+ Y7. Sap xep Nhan Vien theo ho va ten.                         +");
            System.out.println("+ Y8. Sap xep Nhan Vien theo thu nhap.                          +");
            System.out.println("+ Y9. Xuat 5 Nhan Vien co thu nhap cao nhat.                    +");
            System.out.println("+ Y10. Fake Data Nhan Vien                                      +");
            System.out.println("+ Y11. Fake Data Tiep Thi                                       +");
            System.out.println("+ Y12. Fake Data Truong Phong                                   +");
            System.out.println("+ Nhap 0 de ket thuc chuong trinh.                              +");
            System.out.println("=================================================================");
            System.out.print("Nhap yeu cau ban muon thuc thi: ");
            chon = Integer.valueOf(input.nextLine());
            System.out.println("-----------------------------------------------------------------");
            switch (chon){
                case 1:
                    themNhanVien();
                    menu();
                    break;
                case 2:
                    xuatNhanVien();
                    menu();
                    break;
                case 3:
                    timNVTheoMaNV();
                    menu();
                    break;
                case 4:
                    xoaNVtheoMaNV();
                    menu();
                    break;
                case 5:
                    capNhatNVtheoMaNV();
                    menu();
                    break;
                case 6:
                    timNVtheoLuong();
                    menu();
                    break;
                case 7:
                    sapXepTheoName();
                    menu();
                    break;
                case 8:
                    sapXepTheoThuNhap();
                    menu();
                    break;
                case 9:
                    xuat5NhanVienCoThuNhapCaoNhat();
                    menu();
                    break;
                case 10:
                    fakeData();
                    menu();
                    break;
            }
        }while (chon!= 11);
    }
}