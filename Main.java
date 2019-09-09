/**
 * Created by brian on 20/09/2018.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num=enterNum();
        int cubeNum=cube(num);
        if(isTrimorphic(toCharArr(num),toCharArr(cubeNum ))){
            System.out.println("The number "+num+" is a trimorphic number since its cube "+cubeNum+" ends in "+num);
        }else{System.out.println("The number "+num+" is NOT a trimorphic number since its cube "+cubeNum+" does not end in "+num);}
    }
    static int enterNum(){
        Scanner sc=new Scanner (System.in);
        return sc.nextInt();
    }
    static int cube(int num){
        return (int)Math.pow(num,3);
    }
    static char[] toCharArr(int x){
        String str=String.valueOf(x);
        return str.toCharArray();
    }
    static boolean isTrimorphic(char[]num,char[]cubeNum){
        StringBuilder sb=new StringBuilder();
        for (int i=cubeNum.length-1;i>0;i--){
            if(sb.length()==num.length)break;
            sb.append(cubeNum[i]);
        }
        return isEqual(sb.reverse().toString().toCharArray(), num);

    }
    static boolean isEqual(char[] ch, char[]num){
        return Arrays.equals(ch, num);
    }
}
