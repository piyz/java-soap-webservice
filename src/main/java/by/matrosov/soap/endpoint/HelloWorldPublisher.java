package by.matrosov.soap.endpoint;

import by.matrosov.soap.ws.HelloWorldImpl;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {
    public static void main(String[] args) {

        //check this
        //http://localhost:8080/ws/hello?wsdl

        Endpoint.publish("http://localhost:8080/ws/hello", new HelloWorldImpl());
    }
}
