public class greatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(1010,10));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        } else {

            int greatestCommonDivisor=-1;
            int smallerNumber;
            if (first < second) {
                smallerNumber = first;
            } else {
                smallerNumber = second;
            }

            for (int i = 1; i <= smallerNumber; i++) {
                if (first % i == 0 && second % i == 0) {
                    greatestCommonDivisor = i;
                }
            }
            return greatestCommonDivisor;
        }

    }
}
