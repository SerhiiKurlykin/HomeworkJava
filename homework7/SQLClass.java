package homeWork.homework7;

import java.util.HashMap;
import java.util.Map;

public class SQLClass {
    //Сформировать SQL запрос:  Вернуть все записи из cars, где параметры равны заданным, используя StringBuilder.
    //Если значение null, то параметр не должен попадать в запрос.
    //{"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true}
    //Пример: {"id", 1, "country", null, "city", "Helsinki", "year", null}
    //Результат: SELECT * FROM users WHERE id = '1'  AND city = 'Helsilnki';

    public static void main(String[] args) {
        String sqlQuery = buildSQLQuery("V-60", "Germany", "Berlin", null, true);
        System.out.println(sqlQuery);



    }
    public static String buildSQLQuery(String model, String country, String city, String year, Boolean active) {
        StringBuilder query = new StringBuilder("SELECT * FROM cars WHERE ");
        boolean firstCondition = true;


        if (model != null) {
            query.append("model = '").append(model).append("'");
            firstCondition = false;
        }

        if (country != null) {
            if (!firstCondition) {
                query.append(" AND ");
            }
            query.append("country = '").append(country).append("'");
            firstCondition = false;
        }

        if (city != null) {
            if (!firstCondition) {
                query.append(" AND ");
            }
            query.append("city = '").append(city).append("'");
            firstCondition = false;
        }

        if (year != null) {
            if (!firstCondition) {
                query.append(" AND ");
            }
            query.append("year = '").append(year).append("'");
            firstCondition = false;
        }

        if (active != null) {
            if (!firstCondition) {
                query.append(" AND ");
            }
            query.append("active = ").append(active);
        }

        return query.toString();
    }
}
