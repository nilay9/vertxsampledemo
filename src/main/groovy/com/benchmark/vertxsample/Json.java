package com.benchmark.vertxsample;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Helper class to serialize/deserialize POJOs/Maps to JSON and vice versa
 */
public class Json {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    /**
     * Serialize a POJO/Map to JSON String
     *
     * @param object The Object to convert to a JSON string
     * @return The JSON representation of @param object
     * @throws Exception
     */
    public static String encode(final Object object) throws Exception {
        return objectMapper
                .writeValueAsString(object);
    }


}
