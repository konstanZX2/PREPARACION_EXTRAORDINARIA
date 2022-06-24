import java.io.*;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) throws IOException {
        int contador=0;

        File f= File.listRoots()[0];

        System.out.println("Introduce el numero del directorio en el que quieres entrar");
        System.out.println("------------------------------------------------------------");
       for(String carpetas:f.list()){
        String[] arrayDeString= new String[contador];
        
           contador++;
           System.out.println(contador +". " + carpetas );

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