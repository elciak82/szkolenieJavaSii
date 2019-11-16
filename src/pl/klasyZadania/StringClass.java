package pl.klasyZadania;

public class StringClass {
    String name = "Exelina";

    public String getName() {
        return name;
    }

    public StringClass setName(String name) {
        this.name = name;
        return this;
    }

    public StringClass(String name) {
        this.name = name;
    }

    public StringClass() {
    }
}
