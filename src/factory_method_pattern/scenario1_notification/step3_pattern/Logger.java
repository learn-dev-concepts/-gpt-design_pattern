package factory_method_pattern.scenario1_notification.step3_pattern;

public interface Logger {
  void log(String message);
}

class LoggerService  implements  Logger{
  @Override
  public void log(String message) {
    System.out.println("log: >> " + message );
  }
}