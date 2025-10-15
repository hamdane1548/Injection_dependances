package Metier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import DAO.IDAO;

@Component("metier")
public class ImetierImpl implements IMetier {
    @Qualifier("d2")
    @Autowired
    private IDAO dao=null;
    @Override
    public double Calcul() {
        double t=dao.getData();
        double res=t*12*Math.PI/2 * Math.cos(t);
        return res;
    }
    public ImetierImpl(@Qualifier("d") IDAO dao){
        this.dao=dao;
    }
    public ImetierImpl()
    {}
    public void setDao( IDAO Dao){
        this.dao=Dao;
    }
}
