

public class New {
    public static void main(String args[]){
        try {
            int i = 100/0;
        } catch (Exception e) {
            e.printStackTrace();
        } catch (ArithmeticException e1) {
            e1.printStackTrace();
        }

    }
}