package Day13;

public class Test {

    public static void main(String[] args) {
//        Bird bird = new Bird();
//        Xique xique = new Xique();
//
//        Bird xique2 = new Xique();
//        Bird maque = new Maque();
//
//        Xique xique3 = (Xique)  xique2;
//
//        try {
//            Xique xique4 = (Xique)  bird;
//        }catch ( Exception exception){
//
//        }


        //成员 变量是 在生成字节码文件的时候进行设定的
        Bird bird = new Bird();
        System.out.println(bird.age);

        Xique xique = new Xique();
        System.out.println(xique.age);

        Bird bird1 = new Xique();
        System.out.println(bird1.age);


        System.out.println("-----------------------------------");
        //成员方法  是执行的时候进行设定的
        bird.printAge();//10
        xique.printAge();//20
        bird1.printAge();//20
        System.out.println("--------bird---------------------------");
        System.out.println(bird instanceof  Bird);
        System.out.println(bird instanceof  Xique);
        System.out.println(bird instanceof  Maque);

        System.out.println("-------xique----------------------------");
        System.out.println(xique instanceof  Bird);
        System.out.println(xique instanceof  Xique);
//        System.out.println(xique instanceof  Maque);

        System.out.println("-------bird1----------------------------");
        System.out.println(bird1 instanceof  Bird);
        System.out.println(bird1 instanceof  Xique);
        System.out.println(bird1 instanceof  Maque);


//        TestAbstaract testAbstaract = new TestAbstaract();

//        TestAbstaract2 testAbstaract2 = new TestAbstaract2();

        TestAbstaract testAbstaract3 = new TestAbstaract3();
        testAbstaract3.print();
    }
}
