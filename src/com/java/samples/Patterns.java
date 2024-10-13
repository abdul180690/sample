package com.java.samples;
import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Menu();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please choose the Pattern type to execute : ");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.print("Enter the number of rows you want: ");
                int n = sc.nextInt();
                Square.Square_Pattern(n);
                break;
            case 2:
                System.out.print("Enter the number of rows you want: ");
                n = sc.nextInt();
                IncreasT.Increasing_Triangle(n);
                break;
            case 3:
                System.out.print("Enter the number of rows you want: ");
                n = sc.nextInt();
                DecreaseT.Decreasing_Triangle(n);
                break;
            case 4:
                System.out.print("Enter the number of rows you want: ");
                n = sc.nextInt();
                Right_Sided.Right_Sided_Triangle(n);
                break;
            case 5:
                System.out.print("Enter the number of rows you want: ");
                n = sc.nextInt();
                Pyramid.Pyramid_Pattern(n);
                break;
            case 6:
                System.out.print("Enter the number of rows you want: ");
                n = sc.nextInt();
                Hill.Hill_pattern(n);
                break;
            case 7:
                System.out.print("Enter the number of rows you want: ");
                n = sc.nextInt();
                RHill.Reverse_Hill_pattern(n);
                break;
            case 8:
                System.out.print("Enter the number of rows you want: ");
                n = sc.nextInt();
                Diamond.Diamond_pattern(n);
                break;
            default:
                System.out.println("Wrong Choice");
        }
        /*if (choice == 1) {
            System.out.print("Enter the number of rows you want: ");
            int n = sc.nextInt();
            Square.Square_Pattern(n);
        }
        if (choice == 2) {
            System.out.print("Enter the number of rows you want: ");
            int n = sc.nextInt();
            IncreasT.Increasing_Triangle(n);
        }
        if (choice == 3) {
            System.out.print("Enter the number of rows you want: ");
            int n = sc.nextInt();
            DecreaseT.Decreasing_Triangle(n);
        }
        if (choice == 4) {
            System.out.print("Enter the number of rows you want: ");
            int n = sc.nextInt();
            Right_Sided.Right_Sided_Triangle(n);
        }
        if (choice == 5) {
            System.out.print("Enter the number of rows you want: ");
            int n = sc.nextInt();
            Pyramid.Pyramid_Pattern(n);
        }
        if (choice == 6) {
            System.out.print("Enter the number of rows you want: ");
            int n = sc.nextInt();
            Hill.Hill_pattern(n);
        }
        if (choice == 7) {
            System.out.print("Enter the number of rows you want: ");
            int n = sc.nextInt();
            RHill.Reverse_Hill_pattern(n);
        }
        if (choice == 8) {
            System.out.print("Enter the number of rows you want: ");
            int n = sc.nextInt();
            Diamond.Diamond_pattern(n);
        }
        else {
            System.out.println("Wrong Input");
        };*/
    }


    static void Menu() {
        System.out.println("Patterns listed below");
        System.out.println("``````````````````````");
        System.out.println("1. Square Pattern");
        System.out.println("2. Increasing Triangle");
        System.out.println("3. Decreasing Triangle");
        System.out.println("4. RightSided Triangle");
        System.out.println("5. Pyramid");
        System.out.println("6. Hill Pattern");
        System.out.println("7. Reverse Hill Pattern");
        System.out.println("8. Diamond Pattern");
        System.out.println();
    }
}

class Square {
    static void Square_Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    System.out.println("<<<Square Pattern>>>");
    }
}
class IncreasT {
    static void Increasing_Triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("<<<Increasing Triangle Pattern>>>");
    }
}
class DecreaseT {
    static void Decreasing_Triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("<<<Decreasing Triangle Pattern>>>");
    }
}
class Right_Sided {
    static void Right_Sided_Triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("<<<Right Sided Triangle>>>");
    }
}
class Pyramid {
    static void Pyramid_Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                 System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("<<<Pyramid Pattern>>>");
    }
}
class Hill {
    static void Hill_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("<<<Hill Pattern>>>");
    }
}

class RHill {
    static void Reverse_Hill_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            for(int k=i; k<=n; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("<<<Reverse Hill Pattern>>>");
    }
}
class Diamond {
    static void Diamond_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("<<<Diamond Pattern>>>");
    }
}
