package de.telran;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean sleepIn(boolean weekday, boolean vacation){
        return (!weekday || vacation);
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

    public int[] zeroMax(int[] nums) {

        int max = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] % 2 == 1 && nums[i] > max)
                max = nums[i];
            if(nums[i] == 0)
                nums[i] = max;
        }
        return nums;
    }

    public int[] shiftLeft(int[] nums{
        if (nums.length > 0) {
            int first = nums[0];
            for (int i = 0; i < nums.length - 1; i++)
                nums[i] = nums[i + 1];
            nums[nums.length - 1] = first;
        }
        return nums;
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String middleTwo(String str) {

        return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
    }


}
