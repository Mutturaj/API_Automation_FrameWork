package comon.zeptonow.controller.utility;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.Headers;
import io.restassured.http.Header;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class HeaderManager {


  private static Map<String, String> headersMap;


  static {
    try {
      String filepath = System.getProperty("user.dir");
      File file = new File(filepath + File.separator + "src/main/resources/config/headers.json");
      ObjectMapper objectMapper = new ObjectMapper();
      headersMap = objectMapper.readValue(file, HashMap.class);

    } catch (IOException e) {
      throw new RuntimeException("Failed to load headers.json: " + e.getMessage());
    }
  }

  // Method to get common headers
  public static Map<String, String> getCommonHeaders() {
    return new HashMap<>(headersMap);
  }

  // Method to add dynamic headers at runtime (e.g., sessionId, Authorization)
  public static Map<String, String> getHeadersForCart() {
    Map<String, String> finalHeaders = new HashMap<>(headersMap);

    return finalHeaders;
  }

  public static Map<String,String> getHeadersForSearch(String tenant){
    Map<String, String> finalHeaders = new HashMap<>(headersMap);
   finalHeaders.put("tenant",tenant);

    return finalHeaders;
  }

  // Convert headers to RestAssured format
  public static Headers convertToRestAssuredHeaders(Map<String, String> headers) {
    List<Header> headerList = headers.entrySet()
        .stream()
        .map(entry -> new Header(entry.getKey(), entry.getValue()))
        .collect(Collectors.toList());
    return new Headers(headerList);
  }
}