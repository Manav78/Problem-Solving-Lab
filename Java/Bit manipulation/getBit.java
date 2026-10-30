class getBit {
    public static void main(String[] args) {
        int n = 5;// 0101
        int pos = 2;//0001=1
        int bitMask = 1 << pos;//0010

        int newNumber = bitMask | n;//0010 | 0101 = 0111
        int notBitmask = ~(bitMask);
        int newNumber2 = notBitmask & n;


        if ((bitMask & n) == 0) {
            System.out.println("Bit was 0");
        } else {
            System.out.println("Bit was 1");
        }

        System.out.println("new Number: " + newNumber);
        System.out.println("new Number2: " + newNumber2);

    }
}