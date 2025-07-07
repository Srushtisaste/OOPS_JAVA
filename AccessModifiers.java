public class AccessModifiers{
    public static void main(String [] ags){
        BankAccount ba = new BankAccount();
        System.out.println(ba.username);

      
        ba.setPassword("Sarth");
    }
}
class BankAccount {
    public String username ="Srushti"; //public access modifier (can access in main class also)
    private String password; //private access modifier (access within a class only)

    void setPassword(String pwd){
        password =pwd;
    }
}