package br.com.eventhorizon.brewersfriendproxy.common;

public abstract class RequestHandler {

  protected Response handleException() {
    return Response.Builder.create()
        .statusCode(100)
        .headers(ResponseHeadersBuilder.build())
        .body(ErrorResponseBody.Builder
            .create(100, "Error")
            .build())
        .build();
  }
}
