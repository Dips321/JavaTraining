package training.ideas.java.fizzbuzz;

import java.util.Arrays;

/**
 * Created by idndee on 08-08-2014.
 */
public class FrizzBuzz {

    public static Object[] performFrizzBuzz(String[] actualList) {
        String outputList[]= new String[actualList.length];
        Arrays.fill(outputList, "");

        for (int i = 0; i <actualList.length ; i++) {
            boolean flag = false;
            if((Integer.parseInt(actualList[i])%3==0)){
                outputList[i]+="Frizz";
                flag =true;
            }
            if((Integer.parseInt(actualList[i])%5==0)) {
                outputList[i]+= "Buzz";
                flag=true;
            }
            if(!flag){
                outputList[i]=actualList[i];
            }


        }
        return outputList;

    }
}
