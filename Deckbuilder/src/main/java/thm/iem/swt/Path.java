package thm.iem.swt;

public class Path {

    private final int numberOfEncounters;
    private Encounter[] encounterType;

    public Path (int numberOfEncounters) {
        this.numberOfEncounters = numberOfEncounters;
        encounterType = new Encounter[numberOfEncounters];
    }

    // combat -> combat -> vendor -> combat -> rest -> combat -> combat -> vendor -> combat -> boss
    public void fillPathWithEncounters() {

    }
}
