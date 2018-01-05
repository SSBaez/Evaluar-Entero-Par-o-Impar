package com.ssbaez.parimpar;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1,
			evaluacion;
		
		System.out.println("Programa que lee un entero y determina e imprima si es impar o par");
		System.out.print("Ingrese un número entero: ");
		Scanner scan = new Scanner(System.in);
		
		numero1 = scan.nextInt();
		
		evaluacion = numero1%2;
		
		if(evaluacion == 0){
			System.out.println("El número es PAR");
		}
		
		else{
			System.out.println("El número es IMPAR");
		}
		
	}

}
