class MaxStrategy implements OperationStrategy {
    @Override
    public int execute(int a, int b) {
        return a > b ? b : a;
    }
}