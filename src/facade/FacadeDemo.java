package facade;

import java.util.Scanner;

public class FacadeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Registration reg = new Registration();

//        System.out.print("Enter First Character : ");
//        reg.setFirstCharacter(sc.next().charAt(0));
//
//        System.out.print("Enter second Character : ");
//        reg.setSecondCharacter(sc.next().charAt(0));
//
//        System.out.print("Enter third Character : ");
//        reg.setThirdCharacter(sc.next().charAt(0));
//
//        System.out.print("Enter fourth Character : ");
//        reg.setFurthCharacter(sc.next().charAt(0));
//
//        System.out.print("Enter fifth Character : ");
//        reg.setFifthCharacter(sc.next().charAt(0));
//
//        System.out.print("Enter six Character : ");
//        reg.setSixCharacter(sc.next().charAt(0));

//        System.out.print(reg.getRegNo());
        System.out.print("Enter you register no : ");
        String regNumber = sc.nextLine();
        EasyRegistration er = new EasyRegistration(new Registration());

        er.regNumber(regNumber);
        System.out.println(er.getRegNo());
    }
}
