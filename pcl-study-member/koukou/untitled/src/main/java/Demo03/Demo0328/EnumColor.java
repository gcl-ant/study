package Demo03.Demo0328;

public enum EnumColor implements Entity{
    BLUE("(0, 0, 255)",1)
    ,YELLOW("(255, 255, 0)",2)
    ,RED("(255, 0, 0)",3)
    ,GREEN("(0, 0, 255)",4);

    private String rgb;
    private int index;
    private Integer x;
    private EnumColor(String rgb, int index){
            this.rgb = rgb;
            this.index = index;
    }
    public static EnumColor getSelf2(int index){
        for (EnumColor color:EnumColor.values()){
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
