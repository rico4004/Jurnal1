/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal1;

import java.util.Scanner;
/**
 *
 * @author Praktikan
 */
public class Jurnal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner s = new Scanner(System.in);
		System.out.print("Inputan : ");
		int n = s.nextInt();
                System.out.println();
                System.out.println("Output : ");
		for(int i=1;i<=n;i++)
                    System.out.print(fibo(i) + " ");
		System.out.println();
	}

	private static int fibo(int n){
		int f;
		if(n==1 || n==2)
			f=1;
		else
			f = fibo(n-1) + fibo(n-2);
		return f;
	}
}
