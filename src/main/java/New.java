

public class New {
    public static void main(String args[]){
        try {
            int i = 100/0;
            int j= 240/i;
        } catch (AirmathicException e) {
            e.printStackTrace();
        }

        // false  true  true
    String s1 = "hello";
    String s2 = "world";
    String s3 = "helloworld";
    String s4 = s1 + s2;
    String s5 = "hello" + "world";

    System.out.println(s3 == s4);
    System.out.println(s3 == s5);
    System.out.println(s4 == s5);
  
    }
}
