package Day17;

public class EnumEntity{

    private TypeNumber typeNumber;

    public TypeNumber getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(TypeNumber typeNumber) {
        this.typeNumber = typeNumber;
    }

    public static void main(String[] args) {
        EnumEntity enumEntity = new EnumEntity();
        enumEntity.setTypeNumber(TypeNumber.AUDIO);

        switch (enumEntity.getTypeNumber()) {
            case VIDEO:
                System.out.println("aaa === 111");
                break;
        }

        int a =1;
        switch (a) {
            case Entity.AGE:
                System.out.println("aaa === 111");
                break;
        }

        Day16.EnumTest2 e = Day16.EnumTest2.A;
        switch (e){
            case A:
        }
    }
}
