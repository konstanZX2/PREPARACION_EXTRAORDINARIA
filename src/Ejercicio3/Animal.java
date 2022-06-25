package Ejercicio3;

public abstract class Animal {

    private String nombreCientifico;



    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }


    public void moverse(){
        System.out.println("Estoy moviendome");
    }

    public void comer(){
        System.out.println("Estoy comiendo");
    }
}
