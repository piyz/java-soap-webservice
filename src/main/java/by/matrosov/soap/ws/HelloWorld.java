package by.matrosov.soap.ws;

import by.matrosov.soap.model.Something;
import by.matrosov.soap.ws.jaxws.GetSomethingAsMapResponse;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
public interface HelloWorld {

    @WebMethod
    String getHelloWorldAsString(String name);

    @WebMethod
    Something getSomething();

    @WebMethod
    GetSomethingAsMapResponse getMap();
}
