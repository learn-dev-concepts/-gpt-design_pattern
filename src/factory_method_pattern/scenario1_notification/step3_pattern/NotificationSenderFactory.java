package factory_method_pattern.scenario1_notification.step3_pattern;


abstract class NotificationSenderFactory {
    public abstract NotificationSender createSender();
}

class AndroidNotificationSenderFactory extends NotificationSenderFactory {
  Authentication authentication;
  Logger logger;

  public AndroidNotificationSenderFactory(Authentication authentication, Logger logger) {
    this.authentication = authentication;
    this.logger = logger;
  }

  @Override
  public NotificationSender createSender() {
    if (!authentication.authenticate()) throw new RuntimeException("Fail to login");
    logger.log("ready to send notification in android");
    return new AndroidNotificationSender();
  }
}

class IOSNotificationSenderFactory extends NotificationSenderFactory {
  Authentication authentication;

  public IOSNotificationSenderFactory(Authentication authentication) {
    this.authentication = authentication;
  }

  @Override
  public NotificationSender createSender() {
    if (!authentication.authenticate()) throw new RuntimeException("Fail to login");
    return new AndroidNotificationSender();
  }
}