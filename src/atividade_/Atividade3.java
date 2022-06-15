package atividade_;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner (System.in);
    
    double saldo;
    
    System.out.println("Digite o seu saldo");
    saldo = sc.nextDouble();
    
    System.out.println("O seu saldo medio é:" +saldo);
    
    if(saldo >= 0 && saldo <= 500) {
    	System.out.println("Você não tem nenhum credito");
    }else if(saldo >= 501 && saldo <= 1000) {
    	System.out.println("O valor do credito é de:" +saldo *0.30);
    }else if(saldo >= 1001 && saldo <= 3000) {
    	System.out.println("O valor do credito é de:" +saldo *0.40);
    }else if(saldo >= 3001) {
    	System.out.println("O valor do credito é de:" +saldo *0.50);
    }
		

	}

}
