package Day17;

public enum Color {
    BLUE("(0, 0, 255)",1)
    ,YELLOW("(255, 255, 0)",2)
    ,RED("(255, 0, 0)",3)
    ,GREEN("(0, 0, 255)",4);

    private String rgb;
    private int index;

    private  Integer x;
    private Color(String rgb,int index ){
            this.rgb = rgb;
            this.index = index;
    }

    public static Color getSelf2(int index){
        for (Color color:Color.values()){
            if (color.index == index){
                return color;
            }
        }
        return null;
    }

    public String getSelf(int index){
        return this.rgb;
    }

}
