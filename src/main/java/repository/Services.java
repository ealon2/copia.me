package repository;

import domain.Service;
import domain.Status;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

public class Services {
  private static Services instance = new Services();
  public static List<Service> services;

  private Services(){
    services = new ArrayList<>();
  }

  public static Services getInstance() {
    return instance;
  }

  public static TimerTask executePendingServices() {
    services.stream()
        .filter(service -> service.getStatus().equals(Status.PENDING))
        .forEach(service -> service.execute());
    return null;
  }

  public static void addService(Service service){
    services.add(service);
  }
}
