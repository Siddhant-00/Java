public class typecasting {
    public static void main(String[] args) {
        // byte only can store from -128 upto 127;
        // one can assign byte into int but vice versa is not true,
        // but by explicit typecasting we can do this however if we assign value
        // greater than 127  it will mod the ans
        byte b=127;
        int a=b;
        int c=12;
        int d=257;
        byte k=(byte)c;
        byte p=(byte)d;
        System.out.println(a);
        System.out.println(k);
        System.out.println(p);
    }
}
