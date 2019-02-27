
package capitulo4;

public class BirdSighting {
     private String species;
    private Integer number;
    private Integer day;
    public BirdSighting(){
        this.species="robin";
        this.number=1;
        this.day=1;
    }
    public BirdSighting(String species, Integer number, Integer day){
        this.species=species;
        this.number=number;
        this.day=day;
    }
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }
    public String imprimir(){
        return String.format("El dia %d de Abril fueron vistos %d aves de la especie %s",this.getDay(),this.getNumber(),this.getSpecies());
    }

}
