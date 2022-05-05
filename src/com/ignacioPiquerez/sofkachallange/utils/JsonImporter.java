package com.ignaciopiquerez.sofkachallange.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class JsonImporter<T> {

    public <T> JsonImporter() {
    } 

    public ArrayList<T> loadDataFromJson(String filePath, Class<T> clasz) {
        File file  = new File(filePath);

        ObjectMapper objectMapper = JsonMapper.builder()
                .build();
        TypeFactory t = TypeFactory.defaultInstance();
        ArrayList<T> objectList = null;

        try {
            objectList = objectMapper.readValue(file, t.constructCollectionType(ArrayList.class, clasz));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return objectList;
    }
}
