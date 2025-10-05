package DAO;

public class DAOimpl implements IDAO {

    @Override
    public double getData() {
        System.out.println("version base de donne");
        double t=35;
        return t;
    }
}
