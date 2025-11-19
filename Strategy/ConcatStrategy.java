class ConcatStrategy extends OperationStrategy {
    @Override
    public int execute(int a, int b) {
        return Integer.parseInt(String.format("%d%d", a, b));
    }
}
