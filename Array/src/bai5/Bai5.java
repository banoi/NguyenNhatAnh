/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author HP Envy 15
 */
public class Bai5 {

    public int nguyento(int n) {
        if (n > 1) {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return 0;
                }
            }
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai5 b5 = new Bai5();
        int a[][] = new int[3][4];
        while (true) {
            System.out.println("An 1: Nhập mảng");
            System.out.println("An 2: Xuất mảng");
            System.out.println("An A: Tìm số nhỏ nhất trong mảng 2 chiều và in ra vị trí của nó trong mảng 2 chiều.");
            System.out.println("An B: Tìm số lớn nhất trong mảng 2 chiều và in ra vị trí của nó trong mảng 2 chiều.");
            System.out.println("An C: Tìm số nguyên tố trong mảng 2 chiều và in ra vị trí của nó trong mảng 2 chiều.");
            System.out.println("An D: Tính trung bình cộng của từng dòng trong mảng 2 chiều rồi in ra màn hình.");
            System.out.println("An E: In ra các số trùng nhau trong mảng 2 chiều.");
            System.out.println("An F: Nhập vào 1 số x rồi in ra các dòng có tổng lớn hơn x.");
            System.out.println("An G: Nhập vào 1 số y rồi in ra các dòng có trung bình cộng nhỏ hơn y.");
            System.out.println("An H: Nhập vào 1 số z rồi in ra các cột có tổng lớn hơn z.");
            System.out.println("An I: Thoát chương trình");
            System.out.println("Ban hay chon chuc nang: ");
            String n = sc.nextLine();
            switch (n) {
                case "1": {
                    System.out.println("Nhap mang 3*4: ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.printf("a[%d][%d] = ", i, j);
                            a[i][j] = sc.nextInt();
                        }
                    }
                    break;
                }
                case "2": {
                    System.out.println("Xuat mang: ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.printf(+a[i][j] + "\t");
                        }
                        System.out.printf("\n");
                    }
                    break;
                }
                case "a": {
                    int min = a[0][0];
                    for (int i = 0; i < 3; i++) {
                        for (int j = 1; j < 4; j++) {
                            if (a[i][j] < min) {
                                min = a[i][j];
                            }
                        }
                    }
                    System.out.println("So nho nhat trong mang la: " + min);
                    System.out.println("Cac vi tri co gia tri nho nhat la: ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (a[i][j] == min) {
                                System.out.print(+i + "," + j + "\t");
                            }
                        }
                    }
                    System.out.printf("\n");
                    break;
                }
                case "b": {
                    int max = a[0][0];
                    for (int i = 0; i < 3; i++) {
                        for (int j = 1; j < 4; j++) {
                            if (a[i][j] > max) {
                                max = a[i][j];
                            }
                        }
                    }
                    System.out.println("So lon nhat trong mang la: " + max);
                    System.out.println("Cac vi tri co gia tri lon nhat la: ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (a[i][j] == max) {
                                System.out.print(+i + "," + j + "\t");
                            }
                        }
                    }
                    System.out.printf("\n");
                    break;
                }
                case "c": {
                    int b[] = new int[12];
                    int count = 0;
                    int yes = 0;
                    System.out.println("Cac so nguyen to trong mang la: ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (b5.nguyento(a[i][j]) == 1) {
                                for (int k = 0; k < count; k++) {
                                    if (b[k] == a[i][j]) {
                                        yes = 1;
                                    }
                                }
                                if (yes != 1) {
                                    b[count] = a[i][j];
                                    count++;
                                }
                                yes = 0;
                            }
                        }
                    }
                    System.out.println("Cac so nguyen to trong mang la: ");
                    for (int i = 0; i < count; i++) {
                        System.out.print(+b[i] + "\t");
                    }
                    for (int k = 0; k < count; k++) {
                        System.out.println("\nVi tri cua so nguyen to: " + b[k]);
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 4; j++) {
                                if (b[k] == a[i][j]) {
                                    System.out.print(i + "," + j + "\t");
                                }
                            }
                        }
                    }
                    System.out.print("\n");
                    break;
                }
                case "d": {
                    int tb = 0;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            tb += a[i][j];
                        }
                        System.out.println("Trung binh cua dong thu " + i + " la: " + ((float) tb / 4));
                    }
                    break;
                }
                case "e": {
                    int b[] = new int[12];
                    int count = 0;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            b[count] = a[i][j];
                            count++;
                        }
                    }
                    int temp;
                    for (int i = 0; i < 11; i++) {
                        for (int j = i + 1; j < 12; j++) {
                            if (b[i] > b[j]) {
                                temp = b[i];
                                b[i] = b[j];
                                b[j] = temp;
                            }
                        }
                    }
                    int i = 0;
                    int j = 1;
                    System.out.println("Cac so bi trung nhau la: ");
                    while (i < 12) {
                        if (b[i] == b[j]) {
                            System.out.print(+b[j] + "\t");
                            do {
                                j++;
                            } while (b[i] == b[j]);
                            if (j == 11) {
                                break;
                            } else {
                                i = j;
                                j++;
                            }
                        } else {
                            if (j < 11) {
                                i++;
                                j++;
                            } else {
                                break;
                            }
                        }
                    }
                    System.out.print("\n");
                    break;
                }
                case "f": {
                    int sum = 0;
                    System.out.println("x = ");
                    int x = sc.nextInt();
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            sum += a[i][j];
                        }
                        if (sum > x) {
                            System.out.println("Dong thu " + i + " co tong lon hon " + x);
                        }
                        sum = 0;
                    }
                    break;
                }
                case "g": {
                    int sum = 0;
                    System.out.println("y = ");
                    int x = sc.nextInt();
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            sum += a[i][j];
                        }
                        if ((float) sum / 4 < x) {
                            System.out.println("Dong thu " + i + " co trung binh cong nho hon " + x);
                        }
                        sum = 0;
                    }
                    break;
                }
                case "h": {
                    int sum = 0;
                    System.out.println("z = ");
                    int z = sc.nextInt();
                    for (int j = 0; j < 4; j++) {
                        for (int i = 0; i < 3; i++) {
                            sum += a[i][j];
                        }
                        if (sum > z) {
                            System.out.println("Cot thu " + j + " co tong lon hon " + z);
                        }
                        sum = 0;
                    }
                    break;
                }
                case "i": {
                    System.out.println("Thoat chuong trinh");
                    System.exit(0);
                }
                default: {
                    System.out.println("Ban da nhap khong dung, vui long nhap lai");
                    break;
                }
            }
        }
    }
}
