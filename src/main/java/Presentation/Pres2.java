package Presentation;

import DAO.DaoImpl2;
import Metier.ImetierImpl;

public class Pres2 {
    public static void main(String[] args) {
        DaoImpl2  dao = new DaoImpl2();
        ImetierImpl im = new ImetierImpl(dao);
        System.out.println("res="+im.Calcul());
    }
}
