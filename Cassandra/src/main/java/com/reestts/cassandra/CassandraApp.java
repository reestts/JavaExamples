package com.reestts.cassandra;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;

public class CassandraApp {

    public static void main(String[] args) {
        try (CqlSession session = CqlSession.builder().build()) {
            // Создание ключевого пространства, если оно не существует
            session.execute("CREATE KEYSPACE IF NOT EXISTS test_keyspace WITH replication = {'class': 'SimpleStrategy', 'replication_factor': '1'};");

            // Использование ключевого пространства
            session.execute("USE test_keyspace;");

            // Создание таблицы, если она не существует
            session.execute("CREATE TABLE IF NOT EXISTS test_table (id UUID PRIMARY KEY, name text);");

            // Вставка данных в таблицу
            session.execute("INSERT INTO test_table (id, name) VALUES (uuid(), 'test_name');");

            // Выборка данных из таблицы
            ResultSet resultSet = session.execute("SELECT * FROM test_table;");
            for (Row row : resultSet) {
                System.out.printf("Row: id = %s, name = %s%n", row.getUuid("id"), row.getString("name"));
            }
        }
    }
}
