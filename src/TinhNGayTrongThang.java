import java.util.Scanner;

public class TinhNGayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Tháng mà bạn muốn biết ngày là: ");
            int thang = sc.nextInt();

            switch (thang) {
                case 2:
                    System.out.println("Tháng 2 có 28 hoặc 29 ngày.");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Tháng" + thang + "có 31 ngày.");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Tháng" + thang + "có 30 ngày");
                    break;
                default:
                    System.out.println("Không tồn tại tháng" + thang);
                    break;
            }
        }
    }
}
