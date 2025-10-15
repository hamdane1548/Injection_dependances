package DAO;

import org.springframework.stereotype.Component;

@Component("d2")
public class DaoImpl2 implements IDAO{
    @Override
    public double getData() {
        System.out.println("version capteur");
        double t=12;
        return t;
    }
}
