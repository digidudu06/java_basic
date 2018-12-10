package day1;
import java.util.Scanner;
public class WhatName {

	public static void main(String[] args) {
		System.out.print("이름, 나이, 주소가 소개");
	    System.out.println();
	    Scanner scan = new Scanner(System.in);
	    String name = scan.next();
	    String age = scan.next();
	    String addr = scan.next();
	    System.out.print(name+"이고, ");
	    System.out.print(age+"이며, ");
	    System.out.print(addr+"입니다.");

	}

}
