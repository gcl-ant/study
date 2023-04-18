package Demo04.Demo0410;

public class Homework041001 {
    //题目：获取两个字符串的最大相同子串，例如abegad与acegab，最大相同子串为ega。
    public static void main(String[] args) {
        String str1 = "abegad";
        String str2 = "acegab";
        Ega ega = new Ega();
        System.out.println(ega.Ega(str1,str2));
    }
}
class Ega{
    String Ega(String str1, String str2){
        String sss = "";
        for (int i=0;i<=str1.length();i++){
            for (int j=0;j<=i;j++){
                String str = str1.substring(j,str1.length()-i+j);
                if(str2.contains(str)){
                    if(sss.length()<str.length()){
                        sss=str;
                        break;
                    }
                }
            }
        }
        return sss;
    }
}