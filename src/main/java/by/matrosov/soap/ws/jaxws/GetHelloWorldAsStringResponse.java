package by.matrosov.soap.ws.jaxws;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "getHelloWorldAsStringResponse", namespace = "http://ws.soap.matrosov.by/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHelloWorldAsStringResponse", namespace = "http://ws.soap.matrosov.by/")
public class GetHelloWorldAsStringResponse {

    @XmlElement(name = "return", namespace = "")
    private String _return;

    public String getReturn() {
        return this._return;
    }

    public void setReturn(String _return) {
        this._return = _return;
    }
}
