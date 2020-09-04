package br.com.eventhorizon.brewersfriendproxy.common;

import java.util.Collections;
import java.util.Map;

public class Response {

  private final int statusCode;

  private final Map<String, String> headers;

  private final Object body;

  public Response(int statusCode, Map<String, String> headers, Object body) {
    this.statusCode = statusCode;
    this.headers = headers;
    this.body = body;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public Map<String, String> getHeaders() {
    return headers;
  }

  public Object getBody() {
    return body;
  }

  public static class Builder {

    private int statusCode = 200;

    private Map<String, String> headers = Collections.emptyMap();

    private Object body;

    private Builder() {
    }

    public static Builder create() {
      return new Builder();
    }

    public Builder statusCode(int statusCode) {
      this.statusCode = statusCode;
      return this;
    }

    public Builder headers(Map<String, String> headers) {
      this.headers = headers;
      return this;
    }

    public Builder body(Object body) {
      this.body = body;
      return this;
    }

    public Response build() {
      return new Response(statusCode, headers, body);
    }
  }
}
