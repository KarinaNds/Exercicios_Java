package atividade_;

import java.util.*;

public class Atividade7 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 int n1 = 8, n2 = 9, n3 = 7, n4 = 4, n5 = 5, n6 = 6, somaMedias, media1, media2, media3;
		 
		 media1 = (n1 + n2 + n3) /3;
		 media2 = (n4 + n5 + n6) /3;
		 somaMedias = media1 + media2;
		 media3 = (media1 + media2) /2;
		 
		 System.out.println("A media dos numeros 8, 9 e 7 �:" + media1);
		 System.out.println("A media dos numeros 4, 5 e 6 �:" + media2);
		 System.out.println("A soma das duas medias �:" + somaMedias);
		 System.out.println("A media das medias �:" + media3);
		 

	}

}
