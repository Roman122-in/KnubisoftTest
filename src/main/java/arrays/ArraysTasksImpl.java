package arrays;


import java.util.HashSet;
import java.util.stream.IntStream;

public class ArraysTasksImpl implements ArraysTasks {

    @Override
    public int[] reverse(int[] array) {
        int[] array2 = array;
        for (int start = 0, end = array2.length - 1; start < end; start++, end--) {
            int temp = array2[start];
            array2[start] = array2[end];
            array2[end] = temp;
        }
        return array2;

    }

    @Override
    public int[] mergeArrays(int[] array1, int[] array2) {
        return IntStream.concat(IntStream.of(array1), IntStream.of(array2))
                .toArray();
    }

    @Override
    public int[] findMax3InArray(int[] array) {
        int lgt = array.length;


        int[] array3;
        array3 = new int[3];
        for (int i = 0; i < lgt - 1; i++) {
            int max = Math.max(array[i], array[i + 2]);
            array3[i] = max;
        }
        return array3;
    }

    @Override
    public int findLongestIncreasingContinuesSubsequence(int[] array) {
        int count = 1, num = 1;
        if (array.length <= 0) {
            return 0;
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > num) {
                num = count;
            }
        }
        return num;
    }

    @Override
    public int sumOfAllUniqueElements(int[] array) {
        int summa = 0;
        HashSet<Integer> hSet = new HashSet<Integer>();
        int lgt = array.length;
        for (int i = 0; i < lgt; i++) {
            hSet.add(new Integer(array[i]));
        }
        for (Integer item : hSet) {
            summa += item;
        }
        return summa;
    }

    @Override
    public int[] moveZeroes(int[] array) {
        int k = 0;
        for (int i : array) {
            if (i != 0) {
                array[k++] = i;
            }
        }
        for (int i = k; i < array.length; i++) {
            array[i] = 0;
        }
        return array;
    }

    @Override
    public int findFinalValue(int[] nums, int original) {
        return -1;
    }


    @Override
    public String longestCommonPrefix(String[] words) {
        int lgt = words.length;
       if(lgt ==0){
           return "";
       }
       String pr = words[0];
       for(int i =0; i<lgt; i++){
           while (words[i].indexOf(pr)!=0){
               pr = pr.substring(0, pr.length()-1);
           }
       }
return pr;
    }

    @Override
    public int missingNumber(int[] array) {
        int lgt = array.length;
        int summa= lgt*(lgt+1)/2;
        int lgt2 = array.length;
        int summa2=0;
        for (int i = 0; i < lgt2; i++) {
            summa2+=array[i];
        }
        return summa-summa2;
    }

    @Override
    public boolean containsDuplicate(int[] array) {
        int count1=0;
        int count2 =0;

        for(int i =0; i<array.length; i++){
            count1++;
            for(int a =i+1; a<array.length; a++){
                if (array[a] == array[i]) {
                    count1++;
                }
            }
        }
       if(count1-count2>array.length){
           return true;
       }
       else {
           return false;
       }

}
}
