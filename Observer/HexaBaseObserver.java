import java.util.List;

class HexaBaseObserver implements NumericBaseObserver {
    List<String> events;

    public void updateState(int state) {
        events.add(Integer.toHexString(state));
    }

    public List<String> getEvents() {
        return this.events;
    }
}