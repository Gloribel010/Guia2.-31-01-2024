/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_consuelogloribel;

/**
 *
 * @author MINEDUCYT
 */
import java.util.*;

public class Ejercicio1_ConsueloGloribel {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu apellido: ");
        String apellido = scanner.nextLine();

        String nombreCompleto = nombre + " " + apellido;

        System.out.println("Nombre completo: " + nombreCompleto);

        scanner.close();
    }
}
