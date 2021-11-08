package NgoaiLeDemo;

public class ProductException extends Exception {
    private String message;
    public ProductException(String mes){
        this.message = mes;
    }
    @Override
    public String toString() {
        return "ProductException [message=" + message + "]";
    }
    
}
