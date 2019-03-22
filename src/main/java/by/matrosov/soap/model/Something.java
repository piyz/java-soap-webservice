package by.matrosov.soap.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;

@XmlType(propOrder = { "someString", "someInt", "someBoolean" }, name = "Something")
@XmlRootElement
public class Something {

    private String someString;
    private int someInt;
    private boolean someBoolean;

    public Something() {
    }

    public Something(String someString, int someInt, boolean someBoolean) {
        this.someString = someString;
        this.someInt = someInt;
        this.someBoolean = someBoolean;
    }

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    public int getSomeInt() {
        return someInt;
    }

    public void setSomeInt(int someInt) {
        this.someInt = someInt;
    }

    public boolean isSomeBoolean() {
        return someBoolean;
    }

    public void setSomeBoolean(boolean someBoolean) {
        this.someBoolean = someBoolean;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Something something = (Something) o;
        return someInt == something.someInt &&
                someBoolean == something.someBoolean &&
                someString.equals(something.someString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(someString, someInt, someBoolean);
    }

    @Override
    public String toString() {
        return "Something{" +
                "someString='" + someString + '\'' +
                ", someInt=" + someInt +
                ", someBoolean=" + someBoolean +
                '}';
    }
}
