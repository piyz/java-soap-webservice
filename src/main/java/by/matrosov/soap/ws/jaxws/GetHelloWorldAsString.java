package by.matrosov.soap.ws.jaxws;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "getHelloWorldAsString", namespace = "http://ws.soap.matrosov.by/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHelloWorldAsString", namespace = "http://ws.soap.matrosov.by/")
public class GetHelloWorldAsString {

    @XmlElement(name = "arg0", namespace = "")
    private String arg0;

    public String getArg0() {
        return this.arg0;
    }

    public void setArg0(String arg0) {
        this.arg0 = arg0;
    }
}
