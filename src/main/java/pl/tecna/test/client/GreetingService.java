package pl.tecna.test.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("../gwt-rpc")
public interface GreetingService extends RemoteService {
	
  String greetServer(String name) throws IllegalArgumentException;
  String saveExpression(String name) throws IllegalArgumentException;
  String solveExpression() throws IllegalArgumentException;

}
