package factory_method_pattern.scenario1_notification.step3_pattern;

public class Main {
  public static void main(String[] args) {
    AndroidAuthentication androidAuthentication = new AndroidAuthentication("AOS user");
    IOSAuthentication iosAuthentication = new IOSAuthentication("IOS user");
    Logger logger = new LoggerService();

    NotificationSenderFactory androidFactory = new AndroidNotificationSenderFactory(androidAuthentication, logger);
    NotificationSender androidSender = androidFactory.createSender();
    androidSender.send("Hello from android");

    NotificationSenderFactory iosFactory = new IOSNotificationSenderFactory(androidAuthentication);
    NotificationSender iosSender = iosFactory.createSender();
    iosSender.send("Hello from iOS");
  }
}
