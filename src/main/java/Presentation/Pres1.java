package Presentation;

import DAO.DAOimpl;
import Metier.ImetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DAOimpl dao = new DAOimpl();
        ImetierImpl imetier = new ImetierImpl(dao);
        System.out.println("res"+imetier.Calcul());
    }
}
