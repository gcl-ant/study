package Day18;

public class ThreeFoldNode extends Node{
    public ThreeFoldNode(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canConnect(Node other) {

        if (!(other instanceof ThreeFoldNode)){
            return false;
        }

        ThreeFoldNode tn = (ThreeFoldNode) other;
        return Math.abs(tn.getX() - getX()) + Math.abs(tn.getY() - getY()) <= 3;
    }
}
