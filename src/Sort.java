import java.util.Comparator;

public class Sort implements Comparator <KhachHang>{
    @Override
    public int compare(KhachHang o1, KhachHang o2) {
      if((o1.getMaKH()- o2.getMaKH())>0){return 1;}
       else return -1;
    }
}
