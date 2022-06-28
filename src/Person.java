public class Person {

    String personName ;
    String exitColor;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getExitColor() {
        return exitColor;
    }

    public void setExitColor(String exitColor) {
        this.exitColor = exitColor;
    }

    public Person(String personName, String exitColor) {
        this.personName = personName;
        this.exitColor = exitColor;
    }

    public Person() {
    }
}

