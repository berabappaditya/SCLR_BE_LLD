package Prototype_Registry;

public class DSAcourse extends Course {
    String subject;

    DSAcourse() {
    }

    DSAcourse(DSAcourse dsa) {
        super(dsa);
        this.subject = dsa.subject;
    }

    public DSAcourse clone() {
        return new DSAcourse(this);
    }
    
}
