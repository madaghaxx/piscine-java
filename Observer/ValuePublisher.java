import java.util.List;

class ValuePublisher {
    List<NumericBaseObserver> observers;

    public void updateState(int value) {
        observers.forEach(o -> o.updateState(value));
    }

    public void subscribe(NumericBaseObserver observer) {
        if (observer == null) {
            return;
        }
        observers.add(observer);
    }

    public void unsubscribe(NumericBaseObserver observer) {
        observers.removeIf(o -> o == observer);
    }
}
