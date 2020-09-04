package br.com.eventhorizon.brewersfriendproxy.forward;

import br.com.eventhorizon.brewersfriendproxy.common.ResponseBody;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ForwardRequestHandler extends br.com.eventhorizon.brewersfriendproxy.common.RequestHandler implements RequestHandler<ForwardRequest, ResponseBody> {

  private static final Logger LOGGER = LogManager.getLogger(ForwardRequestHandler.class);

  public ForwardRequestHandler() {
  }

  @Override
  public ResponseBody handleRequest(ForwardRequest request, Context context) {
    LOGGER.info("Handling forward: {}", request);
    return ResponseBody.builder().status("Success").build();
  }
}
