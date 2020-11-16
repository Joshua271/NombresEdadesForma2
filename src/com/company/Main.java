package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] nombre = new String[6];
        int[] edad = new int[6];

        Scanner var = new Scanner(System.in);

        System.out.println("Ingrese el nombre de 6 personas con sus respectivas edades: ");
        int i = 0;
        int j = 0;
        int cont1 =1;
        int cont2 =1;

        while(i<6){
            System.out.print(cont1+". ");
            nombre[i] = var.nextLine();
            System.out.print("   ");
            edad[i] = var.nextInt();
            var.nextLine();
            cont1++;
            i++;
        }

        System.out.println("  ");
        System.out.println("La informacion ingresada es la siguiente:");
        System.out.println("  ");

        while(j<6){
            System.out.println(cont2+". Nombre: "+nombre[j]+" , edad: "+edad[j]+" anios");
            cont2++;
            j++;
        }
    }
}
