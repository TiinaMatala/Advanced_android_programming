package oo.concepts;

public class Children extends Person {
    private String cryingSensitivity;

    public String getCryingSensitivity() {
        return cryingSensitivity;
    }

    public void setCryingSensitivity(String cryingSensitivity) {
        this.cryingSensitivity = cryingSensitivity;
    }

    @Override
    public String greet() {
        return "Hi, I'm child with name:" + getName() + "and sensitivity:" + getCryingSensitivity();
    }
}
