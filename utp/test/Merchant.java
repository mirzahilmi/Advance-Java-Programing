package utp.test;

public class Merchant {
    static private final String[] NAME = { "joko", "dengklek" };
    static private final String[] PASSWORD = { "ini_password_joko", "ini_password_dengklek" };
    static boolean loggedIn;

    static Queue[] queues = new Queue[10];
    static int queueAmt;

    static void login(String name, String password) {
        for (int i = 0; i < NAME.length; i++) {
            if (name.equalsIgnoreCase(NAME[i])) {
                for (int j = 0; j < PASSWORD.length; j++) {
                    if (password.equalsIgnoreCase(PASSWORD[i]))
                        loggedIn = true;
                }
            }
        }
    }

    static void addQueue(Queue queue) {
        if (queueAmt >= 10)
            return;

        queues[queueAmt++] = queue;
    }

    static void logout() {
        loggedIn = false;
    }
}
