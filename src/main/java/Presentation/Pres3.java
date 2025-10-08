package Presentation;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pres3 {
    public static  void  main(String[] args){
        ApplicationContext springContext=new ClassPathXmlApplicationContext("config.xml");
        IMetier metier=(IMetier) springContext.getBean("m");
        System.out.println("res="+metier.Calcul());
    }
}
