package Demo03.Demo0330.Homework0330;

public class AnyFoldNode extends Node {
    public AnyFoldNode(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canConnect(Node other) {
        return true;
    }
}
