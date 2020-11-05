package day2;

public class ArmstrongNumberTask2 {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }


    public static boolean isArmstrong(int num) {

        String number = String.valueOf(num);
        int power = number.length();
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = Integer.parseInt("" + number.charAt(i));
            sum += Math.pow(digit, power);
        }
        return sum == num;
    }
}
