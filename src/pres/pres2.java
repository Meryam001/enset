package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));

        String daoClasssName=scanner.nextLine();
        Class cDao=Class.forName(daoClasssName);
        Object dao=(IDao) cDao.newInstance();

        String metierClassName= scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setDao",IDao.class);
        //metier.setDao(dao);
        method.invoke(metier,dao);

        System.out.printf("Résultat=>"+metier.calcul());





    }
}
