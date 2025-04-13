
package views;

import domain.Carnivoro;
import domain.Herbivoro;
import domain.Mamifero;


public class AnimalViewModel{

    private String especie;
    private int edad;
    private String sector;
    private double peso;
    private double valorFijo;
    private double porcentaje;
    private String pais;

    public AnimalViewModel(Mamifero animal) {
        if(animal == null) return;
        especie = animal.getEspecie().getNombre();
        edad = animal.getEdad();
        sector = animal.getSector().toString();
        peso = animal.getPeso();
        valorFijo = animal instanceof Herbivoro ? ((Herbivoro) animal).getValorFijo() : 0;
        porcentaje = animal instanceof Carnivoro ? animal.getEspecie().getPorcentajePesoCarnivoro() : 0;
        pais = animal.getPais().getNombre();
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public String getSector() {
        return sector;
    }

    public double getPeso() {
        return peso;
    }

    public double getValorFijo() {
        return valorFijo;
    }
    
    public double getPorcentaje(){
        return porcentaje;
    }
    
    public String getPais() {
        return pais;
    }
}
