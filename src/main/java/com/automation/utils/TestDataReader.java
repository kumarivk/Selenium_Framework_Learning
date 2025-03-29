package com.automation.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class TestDataReader {
    private static JsonNode jsonData;

    static {
        try {
            ObjectMapper mapper = new ObjectMapper();
            jsonData = mapper.readTree(new File("src/test/resources/testData.json"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getValue(String... keys) {
        JsonNode node = jsonData;
        for (String key : keys) {
            node = node.get(key);
        }
        return node.asText();
    }
}
