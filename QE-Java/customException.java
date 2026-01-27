class CustomException extends Exception {
    private static final long serialVersionUID = 1L;

    public CustomException(String message) {
        super(message); 
    }
}

public class customException {

    public static void exceptionTest(String value) throws CustomException {
        if (value == null) {
            throw new CustomException("Custom Exception: String value is null");
        }
        System.out.println(value);
    }

    public static void main(String[] args) {
        try {
            exceptionTest("Will print to console");
            exceptionTest(null); 
            System.out.println("This line won't execute after exception");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
