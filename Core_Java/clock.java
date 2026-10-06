
public class clock {

    public int clockTimeTotal(int t, int count) {
        if (t == 13 || count+t>40) {
            return count;
        }
        return clockTimeTotal(t+1, count + t);
    }

    public static void main(String[] args) {
        clock c = new clock();
        System.out.println(c.clockTimeTotal(1, 0));
    }
}
