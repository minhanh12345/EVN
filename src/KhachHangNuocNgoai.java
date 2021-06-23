public class KhachHangNuocNgoai extends KhachHang{
    private String quocTich;
    private float thanhTienNN=super.getNumberKW()*super.getPrice();
    public KhachHangNuocNgoai(){}

    public KhachHangNuocNgoai(int maKH, String name, String date, int numberKW, float price, String quocTich) {
        super(maKH, name, date, numberKW, price);
        this.quocTich = quocTich;

    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public float getThanhTienNN() {
        return thanhTienNN;
    }

    public void setThanhTienNN(float thanhTienNN) {
        this.thanhTienNN = thanhTienNN;
    }

    @Override
    public String toString() {
        return super.toString()+"KhachHangNuocNgoai{" +
                "quocTich='" + quocTich + '\'' +
                ", thanhTienNN=" + thanhTienNN +
                '}';
    }
}
