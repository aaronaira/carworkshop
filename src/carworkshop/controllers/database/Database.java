package carworkshop.controllers.database;

import io.github.cdimascio.dotenv.Dotenv;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Database {

    Statement st;

    public Database() throws SQLException {
        Dotenv dotenv = Dotenv.configure().load();
        Connection conn = DriverManager.getConnection(dotenv.get("DB_URL") + dotenv.get("DB_NAME"), dotenv.get("DB_USER"), dotenv.get("DB_PASSWORD"));
        this.st = conn.createStatement();
    }

    public Boolean insertObject(Object o) throws InvocationTargetException, IllegalAccessException {

        Field[] fields = o.getClass().getDeclaredFields();
        Method[] methods = o.getClass().getDeclaredMethods();

        StringJoiner columns = new StringJoiner(",");
        StringJoiner values = new StringJoiner(",");

        for (Field field : fields) {

            String methodName = field.getName();
            methodName = methodName.substring(0, 1).toUpperCase() + methodName.substring(1);
            columns.add(methodName);

            for (Method method : methods) {
                if (method.toString().contains("get" + methodName)) values.add(method.invoke(o).toString());
            }
        }

        return columns.length() > 0 && values.length() > 0;

    }


}
