package com.utils;

import com.annotations.JsonSerializable;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JsonUtils {

    private JsonUtils(){}

    public static void serializeToJson(Object object) {
        Class<?> clazz = object.getClass();

        if (!clazz.isAnnotationPresent(JsonSerializable.class)) {
            System.err.println("Class hasn't got the annotation");
            return;
        }
        if (clazz.isAnnotationPresent(JsonSerializable.class)) {
            System.out.println("Here reflection detected the annotation");
        }

        JsonSerializable annotation = clazz.getAnnotation(JsonSerializable.class);
        String directoryPath = annotation.directory();

        File folder = new File(directoryPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        String fileName = clazz.getName().toLowerCase() + ".json";
        File file = new File(fileName);

        String jsonContent = new Gson().toJson(object);

        try (FileWriter fw = new FileWriter(file)) {
            fw.write(jsonContent);
            System.out.println("Saved correctly in: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
