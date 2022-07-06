package domain;

import repository.Services;

public class ServiceBuilder {

  private Service service;
  private Plan plan;

  public ServiceBuilder addingServicePlan(Plan plan){
    this.plan = plan;
    return this;
  }

  public Service create(){
    Services.addService(service);
    return service;
  }

}
