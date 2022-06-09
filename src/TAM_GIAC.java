import java.util.Scanner;

public class TAM_GIAC {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println(" Nhap canh a= ");
        double a = ip.nextDouble();
        System.out.println("Nhap canh b= ");
        double b = ip.nextDouble();
        System.out.println(" Nhap canh c= ");
        double c = ip.nextDouble();
        double x = a * a + b * b;
        double y = a * a + c * c;
        double z = b * b + c * c;
        String sai2 = "a, b, c khong la 3 canh cua mot tam giac";
        String sai = " Nhap sai gia tri";
        String can = " Day la tam giac can";
        String vuong = " Day la tam giac vuong ";
        String vcan = " Day la tam giac vuong can";
        if (a <= 0) {
            System.out.println(sai);
        } else if (b <= 0) {
            System.out.println(sai);
        } else if (c <= 0) {
            System.out.println(sai);
        } else if (a + b <= c) {
            System.out.println(sai2);
        } else if (a + c <= b) {
            System.out.println(sai2);
        } else if (b + c <= a) {
            System.out.println(sai2);
        } else {
            System.out.println(" a, b, c la 3 canh cua mot tam giac");
            if (a == b) {
                if (a == c) {
                    System.out.println(" Day la tam giac deu");
                }
            } else if (a == b) {
                if (x == c * c) {
                    System.out.println(vcan);
                } else {
                    System.out.println(can);
                }
            } else if (a == c) {
                if (y == b * b) {
                    System.out.println(vcan);
                } else {
                    System.out.println(can);
                }
            } else if (b == c) {
                if (z == a * a) {
                    System.out.println(vcan);
                } else {
                    System.out.println(can);
                }
            } else if (x == c * c) {
                System.out.println(vuong);
            } else if (y == b * b) {
                System.out.println(vuong);
            } else if (z == a * a) {
                System.out.println(vuong);
            } else {
                System.out.println(" Day la tam giac thuong");
            }


        }


    }
}
