package by.matrosov.soap.ws;

import by.matrosov.soap.model.Something;
import by.matrosov.soap.ws.jaxws.GetSomethingAsMapResponse;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.HashMap;
import java.util.Map;

@WebService(endpointInterface = "by.matrosov.soap.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }

    @Override
    public Something getSomething() {
        return new Something("string", 99, false);
    }

    @Override
    public GetSomethingAsMapResponse getMap() {
        Map<Integer, Something> map = new HashMap<>();

        map.put(1, new Something("string1", 1, true));
        map.put(2, new Something("string2", 2, false));
        map.put(3, new Something("string3", 3, true));

        GetSomethingAsMapResponse soapResponse = new GetSomethingAsMapResponse();
        soapResponse.setMap(map);

        return soapResponse;
    }
}
