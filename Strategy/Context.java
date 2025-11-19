class Context {
    OperationStrategy operationStrategy;

    public Context(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public void changeStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public int execute(int a, int b) {
        return this.operationStrategy.execute(a, b);
    }
}