package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        /*
        se connecter à la BD pour récupérer la température

        */
        System.out.printf("version base de données \n");
        double temp=Math.random()*48;
        return temp;
    }
}
