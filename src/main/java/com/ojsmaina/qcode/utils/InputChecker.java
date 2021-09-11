package com.ojsmaina.qcode.utils;

import java.io.IOException;

import lombok.NoArgsConstructor;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * validate various inputs; JSON , simple string, xml file etc
 */
public class InputChecker {
    private InputChecker() {}

    public static boolean validate(String string) {
        boolean valid = false;
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readTree(string);
            valid = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return valid;
    }
}

