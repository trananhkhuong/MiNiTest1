package quan_Ly_Nvien;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        nhanVien[] nhanVien = new nhanVien[3];
        nhanVien[0] = new nhanVien("Tiêu Phong", 1990019, "Ha Noi");
        nhanVien[1] = new nhanVien("Hư Trúc", 1990009, "Ha Noi");
        nhanVien[2] = new nhanVien("Đoàn Dự", 7007700, "Hà Nội");

        while (true) {
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Xóa nhân viên");
            System.out.println("3. Hiển thị nhân viên");
            System.out.println("4. Sửa thông tin nhân viên");
            System.out.println("5. Thoát");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    nhanVien = conTroller.creatNhanVien(nhanVien);
                    break;
                case 2:
                    nhanVien = conTroller.delete(nhanVien);
                    break;
                case 3:
                    conTroller.showNhanVien(nhanVien);
                    break;
                case 4:
                    nhanVien = conTroller.editNhanVien(nhanVien);
                    break;
                case 5:
                    System.out.println("Bye Bye");
                    System.exit(0);
                default:
                    System.out.println("OH no");
                    break;
            }
        }
    }
    }
