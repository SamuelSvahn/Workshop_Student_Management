package se.lexicon.data_access.impl.Sequencer;

public class StudentSequencer {

    private static int sequencer = 0;

    public static int nextId() {
        return ++sequencer;
    }
}
