package mod.ii.atv.i.i;

import java.util.Scanner;

public class ModIIAtvII {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int convidados;
        int cadeirasAdc;
        
        System.out.print("Informe a quantidade de convidados desejada: ");
        convidados = input.nextInt();
        
        if (convidados <= 220) {
            cadeirasAdc = convidados - 150;
            System.out.println("Use o Auditório Alfa");
            if (convidados > 150) {
                System.out.println("Inclua mais " + cadeirasAdc + " cadeiras");
            } else {
                System.out.println("Não há necessidade de cadeiras adicionais");
            }
        } else if (convidados <= 350) {
            System.out.println("Use o Auditório Beta");
        } else{
            System.out.println("Valor inválido.");
        }
    } 
}
