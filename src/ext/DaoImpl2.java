package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.printf("version capteurs \n");
        double temp=60000;
        return temp;

    }
}
