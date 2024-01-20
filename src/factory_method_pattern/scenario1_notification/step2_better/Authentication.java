package factory_method_pattern.scenario1_notification.step2_better;

interface Authentication {
  boolean authenticate();
}

class AndroidAuthentication implements Authentication {
  private String uid;

  public AndroidAuthentication(String uid) {
    this.uid = uid;
  }

  @Override
  public boolean authenticate() {
    System.out.println("do android auth:>> id: " + this.uid);
    return true;
  }
}

class IOSAuthentication implements Authentication {
  private String uid;

  public IOSAuthentication(String uid) {
    this.uid = uid;
  }

  @Override
  public boolean authenticate() {
    System.out.println("do ios auth:>> id: " + this.uid);
    return true;
  }
}