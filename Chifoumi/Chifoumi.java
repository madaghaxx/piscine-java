public class Chifoumi {

    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {
        ChifoumiAction res = ChifoumiAction.ROCK;
        switch (chifoumiAction) {
            case ROCK:
                res = ChifoumiAction.SCISSOR;
                break;
            case PAPER:
                res = ChifoumiAction.ROCK;
                break;
            case SCISSOR:
                res = ChifoumiAction.PAPER;
                break;
        }
        return res;
    }
}
