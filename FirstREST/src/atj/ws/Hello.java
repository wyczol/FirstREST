package atj.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
		
public class Hello {
	@GET
	public String sayHello(){
		return "Hello";

	}
}
