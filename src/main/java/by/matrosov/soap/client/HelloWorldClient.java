package by.matrosov.soap.client;

import by.matrosov.soap.ws.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class HelloWorldClient {
    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("http://localhost:8080/ws/hello?wsdl");

        QName qname = new QName("http://ws.soap.matrosov.by/", "HelloWorldImplService");

        Service service = Service.create(url, qname);

        HelloWorld hello = service.getPort(HelloWorld.class);

        System.out.println(hello.getHelloWorldAsString("WOWOWOWWOWOW"));
    }
}
