package UnitTests;

import java.sql.SQLException;

public class MyMath {
    public static double divide(int a, int b){
        if (b == 0)
            throw new ArithmeticException("Не дели на ноль");
        return a/b;

    }
}
