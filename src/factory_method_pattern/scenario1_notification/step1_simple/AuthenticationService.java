package factory_method_pattern.scenario1_notification.step1_simple;

public class AuthenticationService {
  private String uid;

  public AuthenticationService(String uid) {
    this.uid = uid;
  }

  public boolean androidAuthentication() {
    System.out.println("do android auth:>> id: " + this.uid);
    return true;
  }

  public boolean iOSAuthentication() {
    System.out.println("do ios auth:>> id: " + this.uid);
    return true;
  }
}
