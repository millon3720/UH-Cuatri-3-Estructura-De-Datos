/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg1;
import java.util.Scanner;
/**
 *
 * @author josed
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz=new int[3][3];
        int Diagonal1=0,Diagonal2=0,Llenado=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("digite el valor para la posicion "+i+","+j);
                matriz[i][j]=Integer.parseInt(sc.nextLine());    
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+"    ");
                if (i==j) {
                   Diagonal1+=matriz[i][j];  
                }
                if (i+j==2) {
                    Diagonal2+=matriz[i][j];
                }
            }
            System.out.println();           
        }
            System.out.println("El resultado de la Diagonal 1 es "+Diagonal1);
            System.out.println("El resultado de la Diagonal 2 es "+Diagonal2);
            System.out.println("Total de las sumatorias es: "+(Diagonal1+Diagonal2));
    }
    
}
