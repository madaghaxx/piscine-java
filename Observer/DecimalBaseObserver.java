import java.util.ArrayList;
import java.util.List;

class DecimalBaseObserver implements NumericBaseObserver {
    List<String> events = new ArrayList<>();

    public void updateState(int state) {
        events.add(Integer.toString(state));
    }

    public List<String> getEvents() {
        return this.events;
    }
}