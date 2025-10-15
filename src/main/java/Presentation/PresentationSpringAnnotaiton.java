package Presentation;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationSpringAnnotaiton {
    public static  void  main(String[] args){
        ApplicationContext context=
                new AnnotationConfigApplicationContext("Metier","DAO");
        IMetier metier=context.getBean(IMetier.class);
        System.out.println(metier.Calcul());
    }
}
