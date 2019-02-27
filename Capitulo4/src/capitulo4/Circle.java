
package capitulo4;

public class Circle {
    private float Radio;
    private float Diametro;
    private float Area;
    
    public Circle(){
        this.Radio=1;
    }

    public float Diametro(){
        return Diametro=(float)this.getRadio()*2;
    }
    
    public float Area(){
        return Area=(float) ((Math.pow(this.getRadio(),2))*Math.PI);
    }
    public float getRadio() {
        return Radio;
    }
    public void setRadio(float Radio) {
        this.Radio = Radio;
    }
    public float getDiametro() {
        return Diametro;
    }
    public void setDiametro(float Diametro) {
        this.Diametro = Diametro;
    }

    public float getArea() {
        return Area;
    }

   
    public void setArea(float Area) {
        this.Area = Area;
    }
    
    

}
