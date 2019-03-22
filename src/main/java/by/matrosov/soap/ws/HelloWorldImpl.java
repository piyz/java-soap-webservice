package by.matrosov.soap.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "by.matrosov.soap.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }
}
