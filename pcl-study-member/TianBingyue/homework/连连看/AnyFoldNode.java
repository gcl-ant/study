package Day18;

public class AnyFoldNode extends Node {
    public AnyFoldNode(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canConnect(Node other) {
        return true;
    }
}
