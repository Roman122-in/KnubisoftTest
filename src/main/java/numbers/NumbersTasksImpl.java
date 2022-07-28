package numbers;

import java.math.BigInteger;

public class NumbersTasksImpl implements NumbersTasks {
    @Override
    public void swapTwoNumbersWithoutUsingTemporaryVariable(int firstNumber, int secondNumber) {

    }

    @Override
    public boolean isUglyInt(int number) {
      return true;

    }

    @Override
    public Integer addDigits(int number) {
        String s = Integer.toString(number);
        Integer sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        if(sum<=10){
            return sum;
        }
        else {
            Integer sum2 =0;
            String a = Integer.toString(sum);
            for(int i1=0; i1<a.length(); i1++){
                sum2 +=Integer.parseInt(String.valueOf(a.charAt(i1)));
            }
            return sum2;
        }
    }
    @Override
    public boolean isHarshadNumber(int number) {
        return false;
    }

    @Override
    public boolean isPrime(int number) {
        BigInteger bigInteger = BigInteger.valueOf(number);
        boolean simple = bigInteger.isProbablePrime((int) Math.log(number));
        return simple;

    }

    @Override
    public boolean isArmstrongNumber(int number) {
        String a = Integer.toString(number);
        int[] arr = new int[a.length()];
        for (int i = a.length() - 1; i >= 0; i--) {
            arr[i] = number % 10;
            number /= 10;
        }
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum = (sum + arr[i]*arr[i]*arr[i]);
        }


       if(number==sum){
           return true;
       }
       else {
           return false;
       }

    }

    @Override
    public long factorial(int number) {
        long factorial = 1;
        for(int i = 1; i <= number; ++i)
        {
            factorial *= i;
        }
        return factorial;
    }

    @Override
    public boolean palindrome(int number) {
        String value2 = String.valueOf(number);
        StringBuilder s = new StringBuilder(value2);
        s.reverse();
        String text = s.toString();
        if(text.equals(value2)){
           return true;
        }
        else{
          return false;
        }
    }

    @Override
    public boolean isAutomorphic(int number) {
        long sq = number*number;
        String numstr = Long.toString(number);
        String sqstr = Long.toString(sq);
        if(sqstr.endsWith(numstr)){
            return true;

        }
else {
return false;
        }
    }


}
