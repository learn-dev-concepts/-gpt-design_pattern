package factory_method_pattern.scenario1_notification.good;


abstract class NotificationSenderFactory {
  public abstract NotificationSender createNotificationSender();
}
class AndroidNotificationSenderFactory extends NotificationSenderFactory {
  @Override
  public NotificationSender createNotificationSender() {
    return new AndroidNotificationSender();
  }
}

class IOSNotificationSenderFactory extends NotificationSenderFactory {
  @Override
  public NotificationSender createNotificationSender() {
    return new IOSNotificationSender();
  }
}
