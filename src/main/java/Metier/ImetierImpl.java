package Metier;

import DAO.IDAO;

public class ImetierImpl implements IMetier {
    private IDAO dao=null;
    @Override
    public double Calcul() {
        double t=dao.getData();
        double res=t*12*Math.PI/2 * Math.cos(t);
        return res;
    }
    public ImetierImpl(IDAO dao){
        this.dao=dao;
    }
    public ImetierImpl()
    {}
    public void setDao(IDAO Dao){
        this.dao=Dao;
    }
}
