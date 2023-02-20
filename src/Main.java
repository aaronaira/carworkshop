import carworkshop.controllers.database.Database;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;

import carworkshop.clases.Cliente;

public class Main {
    public static void main(String[] args) throws SQLException, InvocationTargetException, IllegalAccessException {

        //main execution files will be here
        Database db = new Database();
        Cliente aaron = new Cliente("Aaron", "Aira Garcia", "53197999B", "CRT Gandara nº 69", "aaronair@gmail.com");

        System.out.println(db.insertObject(aaron));


    }
}