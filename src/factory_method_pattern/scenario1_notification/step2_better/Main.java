package factory_method_pattern.scenario1_notification.step2_better;

public class Main {
  public static void main(String[] args) {
    AndroidAuthentication androidAuthentication = new AndroidAuthentication("user1");
    IOSAuthentication iOSAuthentication = new IOSAuthentication("user2");

    if (androidAuthentication.authenticate()) {
      AndroidNotificationSender androidNotificationSender = new AndroidNotificationSender();
      androidNotificationSender.send("Hello from Android");
    }

    if (iOSAuthentication.authenticate()) {
      IOSNotificationSender iosNotificationSender = new IOSNotificationSender();
      iosNotificationSender.send("Hello from iOS");
    }
  }
}
