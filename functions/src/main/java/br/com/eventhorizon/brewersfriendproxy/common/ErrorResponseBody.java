package br.com.eventhorizon.brewersfriendproxy.common;

public class ErrorResponseBody {

  private Integer code;

  private String message;

  private ErrorResponseBody() {
  }

  public Integer getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }

  public static class Builder {

    private Integer code;

    private String message;

    private Builder() {
    }

    public static Builder create(int code, String message) {
      Builder builder = new Builder();
      builder.code = code;
      builder.message = message;
      return builder;
    }

    public ErrorResponseBody build() {
      ErrorResponseBody errorResponseBody = new ErrorResponseBody();
      errorResponseBody.code = this.code;
      errorResponseBody.message = this.message;
      return errorResponseBody;
    }
  }
}
