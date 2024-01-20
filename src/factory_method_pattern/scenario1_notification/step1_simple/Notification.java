package factory_method_pattern.scenario1_notification.step1_simple;

public class Notification {
  private String osType;
  private AuthenticationService authenticationService;

  public Notification(String osType, AuthenticationService authenticationService) {
    this.osType = osType;
    this.authenticationService = authenticationService;
  }

  public void send(String message) {
    if (osType.equals("Android")) {
      if (authenticationService.androidAuthentication()) {
        System.out.println("Make sth with Android style");
        System.out.println("Send notification in Android: >> " + message);
      }

    } else if (osType.equals("iOS")) {
      if (authenticationService.iOSAuthentication()) {
        System.out.println("Make sth with iOS style");
        System.out.println("Send notification in iOS: >> " + message);
      }
    }
  }
}
