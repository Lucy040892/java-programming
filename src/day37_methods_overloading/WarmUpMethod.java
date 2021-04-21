package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("cybertekSudent", "abc123"); //POSITIVE TEST / SUNNY DAY
        loginVoid("cybertek", "answer"); //NEGATIVE TEST / RAINY DAY SCENARIO
        //System.out.println(loginVoid(""," ");); ERROR - VOID - no return value;
        System.out.println(login("cybertekStudent", "abc123"));

        boolean isLoginSuccess = login("Nadir", "mountain");
        System.out.println("isLoginSuccess = " +isLoginSuccess);

        if(login("Nadir", "mountain")){
            System.out.println("Welcome to canvas!");
        }else{
            System.out.println("Something wrong.");
        }

        //String ret = System.out.println("hello"); // ERROR it is void

    }
    public static void loginVoid(String username, String password){
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";
        if(username.equalsIgnoreCase((secretUserName)) && password.equals(secretPassword)){
            System.out.println("Login successful, welcome Cybertek student!");
        }else{
            System.out.println("Incorrect user name or password");
        }
    }
    public static boolean login(String userName, String password){
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";
        //return userName.equalsIgnoreCase((secretUserName)) && password.equals(secretPassword);
        if(userName.equalsIgnoreCase((secretUserName)) && password.equals(secretPassword)){
            return true;  // return true, and exit method here. return false will not run
        }
            return false;


    }
}
