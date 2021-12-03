public class Reg {
    public static void main(String[] args) {
        //String
        String arr[]={"aaa","abcd","bcdfg"};
        for (String res:arr) {
            if (res.matches("[a-z]{4}")==true)
            {
                System.out.println(res);
            }

        }
       // System.out.println(str.matches("[a-z]{6}"));
    }
}
