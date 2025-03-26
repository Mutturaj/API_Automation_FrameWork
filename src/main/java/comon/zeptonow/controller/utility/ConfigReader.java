package comon.zeptonow.controller.utility;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class ConfigReader {

  public static JsonNode configData;

  static {
    try {
      String filepath = System.getProperty("user.dir");
      File file = new File(filepath + File.separator + "src/main/resources/config/endpoints.json");
      ObjectMapper objectMapper = new ObjectMapper();
      configData = objectMapper.readTree(file); // Load JSON
    } catch (IOException e) {
      throw new RuntimeException("Failed to load endpoints.json: " + e.getMessage());
    }
  }


  public static String getEndpoint(String key) {
    String[] keys = key.split("\\.");
    System.out.println("Splited Key is "+ keys);

    JsonNode node = ConfigReader.configData;
    for (String k : keys) {
      node = node.get(k);
      if (node == null) {
        throw new RuntimeException("Invalid endpoint key: " + key);
      }
    }
    return node.asText();
  }

}