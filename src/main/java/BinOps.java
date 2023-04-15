public class BinOps {
    public String sum(String a, String b) {
        Integer aa = Integer.parseInt(a, 2);
        Integer bb = Integer.parseInt(b, 2);
        return Integer.toBinaryString(aa + bb);
    }

    public String mult(String a, String b) {
        Integer aa = Integer.parseInt(a, 2);
        Integer bb = Integer.parseInt(b, 2);
        return Integer.toBinaryString(aa * bb);
    }
}
