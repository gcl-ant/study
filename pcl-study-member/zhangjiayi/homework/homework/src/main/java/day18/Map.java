package day18;

public class Map {
    private int width;

    private int height;

    private Node[][] nodes;

    public Map(int width, int height){
        this.width =width;
        this.height=height;
        nodes=new Node[width][height];
    }

    public Node[][] getNodes() {
        return nodes;
    }

    public void setNodes(int x,int y) {
//        return nodes[x][y];
    }
}
