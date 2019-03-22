package by.matrosov.soap.ws.jaxws;

import by.matrosov.soap.model.Something;

import javax.xml.bind.annotation.*;
import java.util.Map;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Response")
public class GetSomethingAsMapResponse {

    @XmlElementWrapper(name = "somethings")
    @XmlElement(name = "something")
    private Map<Integer, Something> map;

    public GetSomethingAsMapResponse() {
    }

    public Map<Integer, Something> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Something> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "SOAPResponse{" +
                "map=" + map +
                '}';
    }
}
