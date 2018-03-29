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
		long fib[] = new long[n];
                fib[0]=1;
                fib[1]=1;                
                for (int i=2; i<n; i++){
                    fib[i] = fib[i-1] + fib[i-2];
                }
                
                for(int i=n-1;i>=0;i--){
                    System.out.print(fib[i] + " ");
                    System.out.print("");
                }
	}
}
