package br.com.eventhorizon.brewersfriendproxy.common;

import java.util.HashMap;
import java.util.Map;

public class ResponseHeadersBuilder {

  private static final String CONTENT_TYPE_KEY = "Content-Type";

  private static final String CONTENT_TYPE_VALUE = "application/json";

  private ResponseHeadersBuilder() {
  }

  public static Map<String, String> build() {
    Map<String, String> headers = new HashMap<>();
    headers.put(CONTENT_TYPE_KEY, CONTENT_TYPE_VALUE);
    return headers;
  }
}
