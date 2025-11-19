import java.util.List;

class DecimalBaseObserver implements NumericBaseObserver {
    List<String> events;

    public void updateState(int state) {
        events.add(Integer.toString(state));
    }

    public List<String> getEvents() {
        return this.events;
    }
}