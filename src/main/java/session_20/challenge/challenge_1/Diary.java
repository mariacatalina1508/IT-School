package session_20.challenge.challenge_1;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Diary {

    private List<Map<LocalDate, String>> entries;

    public Diary(List<Map<LocalDate, String>> entries) {
        this.entries = entries;
    }

    public List<Map<LocalDate, String>> getEntries() {
        return entries;
    }
}