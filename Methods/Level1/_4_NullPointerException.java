package Methods.Level1;

public class _4_NullPointerException {

    static void generateNullPointerException() throws NullPointerException {
        String s = null;
        System.out.println(s.length());
    }

    static void handleException() throws NullPointerException {
        String s = null;
        try {
            System.out.println(s.length());
            
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }

    public static void main(String[] args) {
        handleException();
        generateNullPointerException();
    }
}
