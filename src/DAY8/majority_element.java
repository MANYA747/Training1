package DAY8;
//boyers moove voting algorithm -valid only for two elements
//import java.util.Arrays;
public class majority_element {
    public static void main(String[] args)
    {
     int [] arr  ={1,2,1,2,1,2,2,1,1,2,2};
     int count =0;
     int cand1=0;
     for(int num:arr){
         if(count ==0) {
             cand1 = num;
         }
         if(num==cand1){
             count++;
         }
         else{
             count--;
         }
     }
        System.out.println(cand1);
    }
}
