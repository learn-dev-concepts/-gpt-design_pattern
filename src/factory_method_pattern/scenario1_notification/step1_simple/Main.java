package factory_method_pattern.scenario1_notification.step1_simple;

public class Main {
  public static void main(String[] args) {
    AuthenticationService authenticationService = new AuthenticationService("user1");

    Notification androidSender = new Notification("Android", authenticationService);
    androidSender.send("Hello Android user!");

    Notification iOSSEnder = new Notification("iOS", authenticationService);
    iOSSEnder.send("Hello iOS user!");
  }
}
