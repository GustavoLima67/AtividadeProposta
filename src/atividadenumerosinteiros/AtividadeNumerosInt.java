
package atividadenumerosinteiros;

import java.util.Scanner;


public class AtividadeNumerosInt {

   
    public static void main(String[] args) {
       
    
        Scanner sc = new Scanner(System.in);
        int number;
        int soma = 0;
        int i ;
        int n;
        
       
        System.out.println("Digite a quantidade de numeros");
        n = sc.nextInt();
       
        
        for(i=0;i<n;i++){
            
            System.out.println("Digite um Numero");
            number = sc.nextInt();
         if (number % 2!=0){
            System.out.println("Numero Impar");
        
        }
        soma = soma + number;
    
      }
        System.out.println("A soma dos Numeros Impares sao:"+soma);
         
       
       
    }
    
}
