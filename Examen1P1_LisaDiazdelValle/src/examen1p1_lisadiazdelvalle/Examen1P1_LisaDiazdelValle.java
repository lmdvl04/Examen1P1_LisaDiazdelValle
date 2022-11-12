/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_lisadiazdelvalle;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HTS
 */
public class Examen1P1_LisaDiazdelValle {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        boolean cont = true;
        do {
            System.out.println("---Menu---");
            System.out.println("1. Primos ");
            System.out.println("2. Contorno de pramide ");
            System.out.println("3. Vecinos ");
            System.out.println("4. salida");
            System.out.println("Ingrese el numero de la opcion: ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("---Primos---");
                    System.out.println("Ingrese un numero entero: ");
                    int N = leer.nextInt();
                    if (N < 1) {
                        System.out.println("El numero debe de ser mayor o igual a 1");
                    }
                    System.out.println(primos(N));
                    break;
                case 2:
                    System.out.println("---Contorno---");
                    System.out.println("Ingrese un numero: ");
                    int n = leer.nextInt();
                    
                    
                    contorno(n);
                    break;

                case 3:
                    System.out.println("---Vecinos---");
                    System.out.println("Ingrese una palabra: ");
                    String cadena = leer.next();
                    System.out.println(vecinos(cadena));
                    break;
                case 4:
                    cont = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (cont);
    }//main
    //primos

    public static String primos(int N) {
        int cont1 = 0;
        String cont2 = "1 ";
        int contador =0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                cont1 = i;
                for(int j=cont1;j>0;j--){
                    
                    if(cont1%j==0){
                        contador++;
                    }
                }
                if(contador==2){
                    cont2 += cont1 + " ";
                }
                contador =0;
                
            }
        }

        return cont2;
    }//fin primos
    //contorno de piramide

    public static void contorno(int n) {
        int cont=0;
        if (n % 2 == 0) {
            System.out.println("El numero debe de ser impar");
        }else{
            cont = (n+1)/2;
               
        for (int i = 0; i < cont; i++) {
            for(int j=0; j<n;j++){
                if (i == ((n - 1) / 2)-1 && j>0 && j<n-1) {               
                    System.out.print("+");
                }// 2 for
            else if ((j==((n - 1) / 2)-i || j==((n - 1) / 2)+i)&& i!=cont-1){
                    System.out.print("+");
            }
            else if((j<((n - 1) / 2)-i || j>((n - 1) / 2)+i)|| i==cont-1){
                        System.out.print("*");
        
                }else{
                        System.out.print(" ");
                    }
            }
            System.out.println("");
        }
        }
    }//fin else
    //fin 2
    //Vecinos
    public static String vecinos(String cadena) {
        Random aleatorio = new Random();
        int random = aleatorio.nextInt(2);
        System.out.println(random);
        String acum = "";
        int contador=0;
        

            for (int i = 96; i <= 122; i++) {
                for (int j = 0; j < cadena.length(); j++) {
                    char car = cadena.charAt(j);
                    if (car == i||car == 32);
                    contador++;
                }
            }
            for (int i = 64; i <= 90; i++) {
                for (int j = 0; j < cadena.length(); j++) {
                    char car = cadena.charAt(j);
                    if (car == i){
                    contador++;
                    }
                }
            }
            if (contador == cadena.length()){
                if (random == 0) {
                    acum+= (int) cadena.length() -1;
                }else if (random==1){
                    
                }
        }
        return acum;
    }
}
