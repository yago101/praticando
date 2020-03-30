package pt_printf;

import java.util.Scanner;
import java.util.Locale;


public class Main{
    public static void main (String []args){
        String nome,endereco,profissao;
        int idade, numero;
        int c =0;
        double salario;

//for para fazer a primeira fileira de X
 for(int i = 0; i<13;i++){
System.out.print(i);

 }

 System.out.println();
 do{
    
    switch(c){
        case 1:
        System.out.print("X");
        break;
        case 2:
        System.out.print(" ");
        break;
        case 3:
        System.out.print("B");
        break;
        case 4:
        System.out.print("e");
        break;
        case 5:
        System.out.print("m");
        break;
        case 6:
        System.out.print(" ");
        break;
        case 7:
        System.out.print("v");
        break;
        case 8:
        System.out.print("i");
        break;
        case 9:
        System.out.print("n");
        break;
        case 10:
        System.out.print("d");
        break;
        case 11:
        System.out.print("o");
        break;
        case 12:
        System.out.print(" ");
        break;
        case 13:
        System.out.println("X");
       break;
       
    }
    c++;
}while(c<14);
for(int i = 0; i<13;i++){
    System.out.print("X");
    
     }
    
        System.out.println("Pronto para começar? %n Digite S/N...");
     

    }
}