/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;



/**
 *
 * @author ingrid
 */
public class calcJuros {
    public static void main(String[] args) {
        // Criação de variáveis
        int opcao;
        double c, i, n, j; //c = capital i = taxa n = capitalização k = juros
       
        // Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);
      
        do{
            // Apresentação 
            System.out.println("\n\t --- Calculando de juros e taxas --- \n");
            //menu
            System.out.println("\n\t\t [1] Calcular juros");
            System.out.println("\t\t [2] Calcular taxa");
            System.out.println("\t\t [3] Sair....");
            opcao = entrada.nextInt();
            
            switch(opcao){
                    case 1:
                        // Entradas
                        System.out.print("Digite o capital: ");
                        c = entrada.nextDouble();
                        System.out.print("Digite a taxa: ");
                        i = entrada.nextDouble();
                        System.out.print("Digite o perido de capitalização: ");
                        n = entrada.nextDouble();
                        // Processamento
                        j = (i/100)* c * n;
                        // Saída        
                        System.out.printf("O total de juros é de: R$ %.2f\n",j);
                        break;
                    case 2:
                        // Entradas
                        System.out.print("Digite o juros: ");
                        j = entrada.nextDouble();
                        System.out.print("Digite o capital: ");
                        c = entrada.nextDouble();
                        System.out.print("Digite o perido de capitalização: ");
                        n = entrada.nextDouble();
                        // Processamento
                        i = (j / ( c * n )) * 100;
                        // Saída        
                        System.out.printf("A taxa é de R$ %.2f porcento\n", i);
                        break;
                    default:
                        System.out.println("Opção invalida!!!!");
            }
        }while(opcao!=3);
    }    
}
