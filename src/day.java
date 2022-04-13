import java.util.Arrays;
public class day {

    public static void main(String[] args) {
        //定义一个数组
        int [] infodigit = {12,33,32,56,7};
        for (int i=0;i<infodigit.length-1;i++){
           for (int s = 0;s <infodigit.length-1-i;s++){
             if (infodigit[s] > infodigit[s+1]){
                 int tmo = infodigit[s];
                 infodigit[s]=infodigit[s+1];
                 infodigit[s+1] = tmo;
             }
           }

        }
        System.out.print("从小到大排列"+Arrays.toString(infodigit));



    }





}