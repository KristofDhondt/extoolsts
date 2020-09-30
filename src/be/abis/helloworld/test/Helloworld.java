package be.abis.helloworld.test;

import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		
		Scanner readName = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = readName.next();
		System.out.println ("Hello " +name);
	}

}