package day18;

public abstract class Node {
    private int x;
    private int y;
    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }

    public Node(int x,int y){
        this.x =x;
        this.x =y;
    }

    public abstract boolean canConnect(Node other);
}
