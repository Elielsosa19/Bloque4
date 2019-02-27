
package capitulo4;

public class FormLetterWriter {
    public FormLetterWriter(){
        
    }
    public String displaySalutation(String last_name){
        return String.format("Estimado Sr. o Sra. %s",last_name);
    }
     public String displaySalutation(String last_name, String name){
        return String.format("Estimado(a) %s %s, “Gracias por su pedido reciente”",name,last_name);
    }
}

    

