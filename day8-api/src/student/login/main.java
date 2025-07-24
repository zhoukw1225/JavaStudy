package student.login;

public class main {
    public static void main(String[] args) {
        account[] accounts = new account[2];
        accounts[0] = new account("fqfqfq","900628");
        accounts[1] = new account("zkwzkw","001225");

        loginOperator login = new loginOperator(accounts);
        login.loginsystem();
    }
}
