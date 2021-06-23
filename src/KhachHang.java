public class KhachHang {
    private int maKH;
    private String name;
    private String date;
    private int numberKW;
    private float price;
    public KhachHang(){}

    public KhachHang(int maKH, String name, String date, int numberKW, float price) {
        this.maKH = maKH;
        this.name = name;
        this.date = date;
        this.numberKW = numberKW;
        this.price = price;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumberKW() {
        return numberKW;
    }

    public void setNumberKW(int numberKW) {
        this.numberKW = numberKW;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKH=" + maKH +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", numberKW=" + numberKW +
                ", price=" + price +
                '}';
    }
}
