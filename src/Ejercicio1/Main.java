package Ejercicio1;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner escaneado = new Scanner(System.in);
        int contador = 1;

        int numeroDePosicion = 0;
        String root = File.listRoots()[0].toString();
        File f = File.listRoots()[0];
        File f1 = new File(f.getAbsolutePath());
        String[] arrayDeString = f.list();
        String[] arrayDeString1 = f1.list();
        String actual = root;

        for (String carpetas : arrayDeString) {

            System.out.println(contador + ". " + carpetas +" carpeta");
            contador++;
        }

        while (numeroDePosicion != -1) {
         //   System.out.println(f1.getParent());


            System.out.println("---------------------------------------------------------------");
            System.out.println("Introduce el numero del directorio en el que quieres entrar");
            System.out.println("Controles: -1 salir, 0 directorio padre = volver atras, los numeritos :)");
            System.out.println("------------------------------------------------------------");
            numeroDePosicion = escaneado.nextInt();


            if (numeroDePosicion == -1) {
                break;
            } else if (numeroDePosicion == 0) {
                if (actual.compareTo(root) != 0) {
                    actual = f1.getParent();

                } else {
                    actual = root;
                }


            } else if (numeroDePosicion > arrayDeString1.length || numeroDePosicion < -1) {
                System.out.println("No te rayes bro");
                System.out.println("Te vuelvo a poner las carpetitas crack");
            } else {
                actual = f1.getAbsolutePath() + "/" + arrayDeString1[numeroDePosicion - 1];
            }


            System.out.println("---------------------------------------------------------");
            System.out.println("Has entrado en: " + actual);
            System.out.println("---------------------------------------------------------");
            f1 = new File(actual);
            if (f1.isDirectory()) {
                arrayDeString1 = f1.list();
                int contador1 = 1;
                System.out.println("0. Archivo Padre");
                if (arrayDeString1 == null) {
                    System.out.println("TA EMPTY COMO TU");
                } else {
                    for (String carpetas : arrayDeString1) {
                        File temporal = new File(f1.getAbsolutePath() + "/" + carpetas);
                        if (temporal.isDirectory()) {
                            System.out.println(contador1 + ". " + carpetas + " carpeta");
                        } else {
                            System.out.println(contador1 + ". " + carpetas);
                        }
                        contador1++;
                    }


                }
            } else {
                System.out.println("Creo que no puedes pasar");
            }
        }
    }
}
/*haz una array de string
[4:49]
donde el contador se la posicion
[4:50]
dentro del bucles asignas a esa array
[4:51]
luego preguntas el numero
[4:51]
y despues haces un new FileInputReader() y ya esta
[4:52]
pasandole en el new la string seleccionada*/