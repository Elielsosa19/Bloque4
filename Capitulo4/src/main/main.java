
package main;

import capitulo4.Billing;
import capitulo4.BirdSighting;
import capitulo4.Bread;
import capitulo4.Circle;
import capitulo4.FormLetterWriter;
import capitulo4.MathTest;


public class main {
      public static void main(String[] args) {
        System.out.println("\nEjercicio1");
FormLetterWriter fw = new FormLetterWriter();
        System.out.println(fw.displaySalutation("Sosa"));
        System.out.println(fw.displaySalutation("Sosa","Miguel"));

System.out.println("\nEjercicio 2");
        Billing b=new Billing();
        System.out.println(b.computeBill(10));
        System.out.println(b.computeBill(10,2));
        System.out.println(b.computeBill(10,2,3));

System.out.println("\nEjercicio3");
BirdSighting bird = new BirdSighting("Patos",4,6);
     


System.out.println("\nEjercicio5");
Bread bre1 = new Bread("Maiz",23.5f);
        Bread bre2 = new Bread("trigo",13.5f);
        Bread bre3 = new Bread("centeno",(43.5f));
        System.out.println(bre1);
        System.out.println(bre2);
        System.out.println(bre3);

System.out.println("\nEjercicio 6");
        Circle c=new Circle();
        System.out.println(c.Area());
        System.out.println(c.Diametro());

        System.out.println("\nEjercicio7");
MathTest mat = new MathTest();
        System.out.println("Inciso a)");
        System.out.println(mat.a((double)37));
        System.out.println("Inciso b)");
        System.out.println(mat.b((double)300));
        System.out.println("Inciso c)");
        System.out.println(mat.cy((double)22.8));
        System.out.println("Inciso d)");
        System.out.println(mat.d('D', 71));
        System.out.println("Inciso e)");
        System.out.println(mat.e());


    }
}
