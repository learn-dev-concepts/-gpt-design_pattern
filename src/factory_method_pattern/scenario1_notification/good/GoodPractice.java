package factory_method_pattern.scenario1_notification.good;

public class GoodPractice {
  public static void main(String[] args) {
    NotificationSenderFactory factory;
    NotificationSender sender;

    // 안드로이드 알림 발송
    factory = new AndroidNotificationSenderFactory();
    sender = factory.createNotificationSender();
    sender.send("Hello Android user!");

    // iOS 알림 발송
    factory = new IOSNotificationSenderFactory();
    sender = factory.createNotificationSender();
    sender.send("Hello iOS user!");
  }
}
