package factory_method_pattern.scenario1_notification.step3_pattern;

interface NotificationSender {
  void send(String message);
}

class AndroidNotificationSender implements NotificationSender {
  @Override
  public void send(String message) {
    System.out.println("Make sth with Android style");
    System.out.println("Send notification in Android: >> " + message);
  }
}

class IOSNotificationSender implements NotificationSender {
  @Override
  public void send(String message) {
    System.out.println("Make sth with iOS style");
    System.out.println("Send notification in iOS: >> " + message);
  }
}