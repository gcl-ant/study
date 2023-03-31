package Demo03.Demo0328;

public class EnumEntity{
    private EnumTest1 typeNumber;
    public EnumTest1 getTypeNumber() {
        return typeNumber;
    }
    public void setTypeNumber(EnumTest1 typeNumber) {
        this.typeNumber = typeNumber;
    }

    public static void main(String[] args) {
        EnumEntity enumEntity = new EnumEntity();
        enumEntity.setTypeNumber(EnumTest1.AUDIO);

        switch (enumEntity.getTypeNumber()) {
            case VIDEO:
                System.out.println("aaa === 111");
                break;
        }
        int a = 1;
        switch (a) {
            case Entity.AGE:
                System.out.println("aaa === 222");
                break;
        }
    }
}
