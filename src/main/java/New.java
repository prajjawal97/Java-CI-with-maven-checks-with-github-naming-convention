

public class New {
    public static void main(String args[]){
        try {
            int i = 100/0;
            int j= 240/i;
        } catch (Exception e) {
            e.exception();
        }
    }
}
