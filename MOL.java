public class Mol {
    public void add(int a) {
        System.out.println(a);
    }

    public void add(float b) {
        System.out.println(b);
    }

    public void add(double c) {
        System.out.println(c);
    }

    public static void main(String args[]) {
        Mol o = new Mol();
        o.add(3);
        o.add(3.3f);
        o.add(3.33);
    }
}
