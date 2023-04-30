package com.reestts.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoApp {

    public static void main(String[] args) {
        // Замените "mongodb://localhost:27017" на адрес вашего сервера MongoDB, если он работает на другом адресе
        String connectionString = "mongodb://localhost:27017";
        MongoClient mongoClient = MongoClients.create(connectionString);

        // Выбираем базу данных и коллекцию
        MongoDatabase database = mongoClient.getDatabase("test_database");
        MongoCollection<Document> collection = database.getCollection("test_collection");

        // Вставляем документ в коллекцию
        Document document = new Document("name", "John Doe")
                .append("age", 30)
                .append("city", "New York");
        collection.insertOne(document);

        // Запрашиваем документы из коллекции
        for (Document doc : collection.find()) {
            System.out.println(doc.toJson());
        }

        // Закрываем соединение с MongoDB
        mongoClient.close();
    }
}
