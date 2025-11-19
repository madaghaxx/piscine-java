import java.util.List;

class BinaryBaseObserver implements NumericBaseObserver {
    List<String> events;

    public void updateState(int state) {
        events.add(Integer.toBinaryString(state));
    }

    public List<String> getEvents() {
        return this.events;
    }
}