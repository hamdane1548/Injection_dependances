package Presentation;

import DAO.DaoImpl2;
import DAO.IDAO;
import Metier.IMetier;
import Metier.ImetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
      Scanner scanner=new Scanner(new File("config.txt"));
      String daoClassName=scanner.nextLine();
      Class Cdao=Class.forName(daoClassName);
      IDAO dao=(IDAO) Cdao.newInstance();
      String MetierClassName=scanner.nextLine();
      Class Cmetier=Class.forName(MetierClassName);
      IMetier metier=(IMetier) Cmetier.getConstructor(IDAO.class).newInstance(dao);
        System.out.println(metier.Calcul());

    }
}
