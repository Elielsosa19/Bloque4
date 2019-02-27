
package capitulo4;

public class MathTest {
    public Double a(Double a){
        return Math.sqrt(a);
    }
    public String b(Double a){
        return String.format("El sen(a): %.4f, el cos(a): %.4f",Math.sin(a),Math.cos(a));
    }
    
    public String cy(Double a){
        return String.format("El floor: "+Math.floor(a)+", ceiling: "+Math.ceil(a)+", round: "+Math.round(a));
    }
    public Integer e(){
        return (int)(Math.random()*20)+1;
    }
    public String d(Character ch, Integer a){
        return String.format("Minimo: "+Math.min(ch, a)+"   Maximo: "+Math.max(ch, a));
    }
    

}
