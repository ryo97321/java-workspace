import mypackage.MyPackage;
import mypackage.sub.MyPackageSub;

public class MainProg {
    public static void main(String[] args) {
        MyPackage mp = new MyPackage();
        MyPackageSub mps = new MyPackageSub();

        mp.print();
        mps.print();
    }
}