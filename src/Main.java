import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Them");
            System.out.println("2.Edit");
            System.out.println("3.Remove");
            System.out.println("4.FindbyName");
            System.out.println("5.Sort");
            System.out.println("6.Show");
            System.out.println("7.FindByBN");
            System.out.println("8.Exit");
            int chose = 0;
            chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    System.out.println("1.Khach hang viet nam");
                    System.out.println("2.Khac hang nuoc ngoai");
                    int chose1 = scanner.nextInt();
                    if (chose1 == 1) {
                        Manager.add("KhachHangVietNam");
                        break;
                    } else {
                        Manager.add("KhachHangNuocNgoai");
                        break;

                    }
                case 2:
                    System.out.println("Nhap ma Kh");
                    int maKH = scanner.nextInt();
                    Manager.set(maKH);
                    break;
                case 3:
                    System.out.println("Nhap ma Kh");
                    int maKH1 = scanner.nextInt();
                    Manager.remove(maKH1);
                    break;
                case 4:
                    System.out.println("Nhap Name");
                    String name = scanner.next();
                    Manager.findName(name);
                    break;
                case 5:
                    Manager.sort();
                    break;
                case 6:
                    Manager.show();
                    break;
                case 7:
                    System.out.println("Nhap ma Kh");
                    int maKH2 = scanner.nextInt();
                    Manager.findByBN(maKH2);
                    break;
                case 8:
                    System.exit(0);
            }
        }
    }
}
