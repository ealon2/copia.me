import repository.Services;

import java.util.Timer;

public class Application {
  private final static Timer cron = new Timer();

  public static void main(String[] args) {

    cron.scheduleAtFixedRate(
        Services.executePendingServices(),
        60,
        60
    );
  }
}
