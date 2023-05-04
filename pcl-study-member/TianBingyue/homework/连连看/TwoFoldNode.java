package Day18;

public class TwoFoldNode extends Node {
    public TwoFoldNode(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canConnect(Node other) {

        if (!(other instanceof TwoFoldNode)) {
            return false;
        }

        TwoFoldNode tn = (TwoFoldNode) other;

        return tn.getX() == getX() || tn.getY() == getY();
    }
}
