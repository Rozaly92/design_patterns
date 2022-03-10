package structural.adapter;

import structural.adapter.AdapterJavaToDataBase;
import structural.adapter.DataBase;

public class DataBaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaToDataBase();
        dataBase.insert();
        dataBase.update();
        dataBase.select();
        dataBase.remove();
    }
}
