package oo.concepts;

public class Nanny extends Person {

    private int personnelNr = 2;

    public int getPersonnelNr() {
        return personnelNr;
    }

    public void setPersonnelNr(int personnelNr) {
        if (personnelNr > 0 && personnelNr < 100) {
            this.personnelNr = personnelNr;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
}
