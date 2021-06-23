public class KhachHangVietNam extends KhachHang {
    private float dinhMuc;
    private float thanhTienVN;

    public KhachHangVietNam() {
    }

    public KhachHangVietNam(int maKH, String name, String date, int numberKW, float price, float dinhMuc) {
        super(maKH, name, date, numberKW, price);
        this.dinhMuc = dinhMuc;

    }

    public float getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(float dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public float getThanhTienVN() {
        return thanhTienVN;
    }

    public void setThanhTienVN(float thanhTienVN) {
        this.thanhTienVN = thanhTienVN;
    }

    @Override
    public String toString() {
        return super.toString()+"KhachHangVietNam{" +
                "dinhMuc=" + dinhMuc +
                ", thanhTienVN=" + thanhTienVN +
                '}';
    }
}
