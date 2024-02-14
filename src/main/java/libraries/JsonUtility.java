package libraries;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JsonUtility {

    public static JSONObject readJsonFile(String filePath) {
        JSONObject jsonObject;
        try {
            jsonObject = (JSONObject) new JSONParser().parse(new FileReader(filePath));
        } catch (IOException | ParseException ex) {
            throw new RuntimeException(ex);
        }
        return jsonObject;
    }

}