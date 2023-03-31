package Demo03.Demo0330.Homework0330;

 class Map {

    private int witdth;

    private int height;

    private Node[][] nodes;

    public Map(int witdth, int height) {
        this.witdth = witdth;
        this.height = height;
        nodes = new Node[witdth][height];
    }

    public Node[][] getNodes() {
        return nodes;
    }

    public Node getNode(int x,int y){
        return nodes[x][y];
    }

    public void setNodes(Node[][] nodes) {
        this.nodes = nodes;
    }

    public void setNode(int x, int y ,Node node){
        this.nodes[x][y] = node;
    }

    public boolean canConnect(Node node1 ,Node node2){
        return node1.canConnect(node2);
    }
}
