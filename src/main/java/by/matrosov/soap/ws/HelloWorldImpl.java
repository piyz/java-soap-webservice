package by.matrosov.soap.ws;

import by.matrosov.soap.model.Something;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(endpointInterface = "by.matrosov.soap.ws.HelloWorld")
@XmlSeeAlso({Something.class})
public class HelloWorldImpl implements HelloWorld {

    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }

    @Override
    public Something getSomething() {
        return new Something("string", 99, false);
    }
}
