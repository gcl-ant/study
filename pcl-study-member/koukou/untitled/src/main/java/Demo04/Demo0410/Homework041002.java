package Demo04.Demo0410;

public class Homework041002 {
    //题目：把前面的格式转换成后面的格式。
    //   ttt5yjd-jdd4yh      tttyyyyyjd@jddyyyyh
    //   Hsdkf4sd-fsd3tr    Hsdkfssssd@fsd3tttr
    //   Sf5sd-dsd4wr       Sfsssssd@dsdwwwwr
    public static void main(String[] args) {
        String str1 = "ttt5yjd-jdd4yh";
        String str2 = "Hsdkf4sd-fsd3tr";
        String str3 = "Sf5sd-dsd4wr";
        Change change = new Change();
        System.out.println(change.change(str1));
        System.out.println(change.change(str2));
        System.out.println(change.change(str3));
    }
}
class Change{
    String change(String str){
        for(int i=0;i<str.length();i++){
            StringBuffer sb = new StringBuffer();
            if('1'<=str.charAt(i)&&str.charAt(i)<='9'){
                int valueOf = Integer.parseInt(String.valueOf(str.charAt(i)));
                for(int j=1;j<valueOf;j++){
                    sb.append(str.charAt(i+1));
                }
                str=str.replace(String.valueOf(str.charAt(i)),sb);
            }
        }
        str = str.replace("-","@");
        return str;
    }
}