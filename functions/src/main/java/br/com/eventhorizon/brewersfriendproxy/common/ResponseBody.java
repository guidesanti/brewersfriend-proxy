package br.com.eventhorizon.brewersfriendproxy.common;

public class ResponseBody {

  private static final String SUCCESS = "Success";

  private String status;

  private ResponseBody() {
    this.status = SUCCESS;
  }

  private ResponseBody(ResponseBody obj) {
    this.status = obj.status;
  }

  public String getStatus() {
    return status;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {

    private ResponseBody responseBody = new ResponseBody();

    private Builder() {
    }

    public Builder status(String status) {
      this.responseBody.status = status;
      return this;
    }

    public ResponseBody build() {
      return new ResponseBody(this.responseBody);
    }
  }
}
