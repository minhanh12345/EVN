import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    static List<KhachHang> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);


    public static void add(String nameKH) {
        KhachHang khachHang = create(nameKH);
        list.add(khachHang);
    }

    public static KhachHang create(String nameKH) {
        System.out.println("nhap maKH");
        int maKH = scanner.nextInt();
        System.out.println("nhap name");
        String name = scanner.next();
        System.out.println("Nhap date");
        String date = scanner.next();
        System.out.println("Nhap number KW");
        int numberKW = scanner.nextInt();
        System.out.println("Nhap price");
        float price = scanner.nextFloat();
        if (nameKH == "KhachHangVietNam") {
            System.out.println("Nhap dinh muc");
            float dinhMuc = scanner.nextFloat();
            return new KhachHangVietNam(maKH, name, date, numberKW, price, dinhMuc);
        } else {
            System.out.println("nhap Quoc Tich");
            String quocTich = scanner.next();
            return new KhachHangNuocNgoai(maKH, name, date, numberKW, price, quocTich);
        }
    }

    public static void remove(int id) {
        int check = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaKH() == id) {
                check = i;
            }
        }
        if (check < 0) {
            System.out.println("Ko co MaKH");
        } else {
            list.remove(check);
        }
    }

    public static void findName(String name) {
        int check = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                check = i;
            }
        }
        if (check < 0) {
            System.out.println("ko co");
        } else {
            System.out.println(list.get(check));
        }
    }

    public static void set(int maKh) {
        int check = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaKH() == maKh) {
                check = i;
            }
        }
        if (check < 0) {
            System.out.println("Ko co MaKH");
        } else {
            if (list.get(check) instanceof KhachHangVietNam) {
                System.out.println("nhap maKH");
                list.get(check).setMaKH(scanner.nextInt());
                System.out.println("nhap name");
                list.get(check).setName(scanner.next());
                System.out.println("Nhap date");
                list.get(check).setDate(scanner.next());
                ;
                System.out.println("Nhap number KW");
                list.get(check).setNumberKW(scanner.nextInt());
                System.out.println("Nhap price");
                list.get(check).setPrice(scanner.nextFloat());
                System.out.println("Nhap dinh muc");
                ((KhachHangVietNam) list.get(check)).setDinhMuc(scanner.nextFloat());
            } else if (list.get(check) instanceof KhachHangNuocNgoai) {
                System.out.println("nhap maKH");
                list.get(check).setMaKH(scanner.nextInt());
                System.out.println("nhap name");
                list.get(check).setName(scanner.next());
                System.out.println("Nhap date");
                list.get(check).setDate(scanner.next());
                ;
                System.out.println("Nhap number KW");
                list.get(check).setNumberKW(scanner.nextInt());
                System.out.println("Nhap price");
                list.get(check).setPrice(scanner.nextFloat());
                System.out.println("Nhap Quoc Tich");
                ((KhachHangNuocNgoai) list.get(check)).setQuocTich(scanner.next());

            }
        }
    }

    public static void sort() {
        Sort sort = new Sort();
        list.sort(sort);
    }

    public static void show() {
        for (KhachHang s : list) {
            System.out.println(s);
        }
    }

    public static void findByBN(int maKH) {
        Manager.sort();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            arr.add(list.get(i).getMaKH());
        }
        sortArr sortArr=new sortArr();
        arr.sort(sortArr);
        int left=0;
        int right=arr.size()-1;
        int check=-1;
        while (left<=right){
            int mid=(right-left)/2;
            if(arr.get(mid)==maKH){
                check=mid;break;
            }else if(maKH<arr.get(mid)){
                right=mid-1;
            }else left=mid+1;
        }

        if (check < 0) {
            System.out.println("ko co");
        } else {
            System.out.println(list.get(check));
        }
    }

}
