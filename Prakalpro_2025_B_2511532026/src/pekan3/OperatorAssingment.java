package pekan3;

import java.util.Scanner;

public class OperatorAssingment {

	public static void main(String[] args) {
		int A1;
		int A2;
		int hasil;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Input angka-1: ");
		A1 = keyboard.nextInt ();
		System.out.println("Input angka-2: ");
		A2 = keyboard.nextInt ();
		keyboard.close();
		System.out.println("assingment Penambahan");
		A1 += A2;// penambahan, sekarang A1 = 15
		System.out.println("penambahan :" + A1);
		System.out.println("assingment pengurangan");
		A1 -= A2;// pengurangan, sekarang A1 = 10
		System.out.println("pengurangan:" + A1);
		System.out.println("assingment Perkalian");
		A1 *= A2;// perkalian, sekarang A1 = 50
		System.out.println("perkalian:" + A1);
		System.out.println("assingment hasil bagi");
		A1 /= A2;//Pembagian, sekarang A1 = 10
		System.out.println("pembagian:" + A1);
		System.out.println("Assingment sisa bagi");
		A1 %= A2;// Sisa bagi, sekarang sisa bagi = 0
		System.out.println("sisa bagi:" + A1);
		// TODO Auto-generated method stub
//
	}

}
