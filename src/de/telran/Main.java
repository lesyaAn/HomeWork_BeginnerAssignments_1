package de.telran;

public class Main {

    public static boolean main(String[] args) {

        public boolean sleepIn(boolean weekday, boolean vacation){
            return (!weekday || vacation);
        }
    }

    public int diff21(int n){
        if(n <= 21){
            return n - 21;
        } else {
            return (n - 21) * 2;
        }
    }

    public String endUp(String str){

        int beginUpp = str.length()-3;
        int length = str.length();

        if (str.length() < 3)
            return str.toUpperCase();

        String upp = str.substring(beginUpp, length).toUpperCase();
            return str.substring(0, beginUpp) + upp;
    }

    public int intMax(int a, int b, int c){
        int max = 0;
        if ( a > b){
            max = a;
        }else{
            max = b;
        }if (c > max){
            max = c;
        }
        return max;
    }

    public boolean commonEnd(int[] a, int[] b) {

        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public int sum2(int[] nums){

        if(nums.length >= 2)
            return (nums[0] + nums[1]);
        if(nums.length == 1)
            return nums[0];
        return 0;
    }
    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] % 2 == 0) count++;
        return count;
    }
    
}
