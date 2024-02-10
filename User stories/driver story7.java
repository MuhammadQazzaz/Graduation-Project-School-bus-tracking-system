public class Driver {
    private boolean loggedIn;



// Other properties and methods specific to the Driver class...

public boolean isLoggedIn() {
    return loggedIn;
}

public void login() {
    // Implement login logic
    loggedIn = true;
    System.out.println("Driver logged in");
}

public void logout() {
    // Implement logout logic
    if (loggedIn) {
        loggedIn = false;
        System.out.println("Driver logged out securely");
    } else {
        System.out.println("Driver is not logged in");
    }
}

// Additional methods and properties...

public static void main(String[] args) {
    Driver driver = new Driver();
    driver.login();

    // Perform tasks...

    driver.logout();
}
}
