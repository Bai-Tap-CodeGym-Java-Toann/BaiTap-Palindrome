public class Palindrome {
    public static int reverse(int number) {
        String[] numCharArr = String.valueOf(number).split("");
        String outPut = "";
        for (int i = 0; i < numCharArr.length; i++) {
            if ((i == numCharArr.length - 1) &&
                    (numCharArr[i].equals("0"))) {
                continue;
            }
            outPut = numCharArr[i] + outPut;
        }
        return Integer.parseInt(outPut);
    }
    public static boolean isPalindrome(int n){
        if (n == reverse(n)){
            return true;
        }
        return false;
    }
}
