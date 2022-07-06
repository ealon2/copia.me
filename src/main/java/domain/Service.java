package domain;

import lombok.Getter;

public abstract class Service {

  @Getter protected Status status;
  @Getter protected Plan plan;
  @Getter protected Document original, documentToReview;

  public abstract void automaticValidation(Document original, Document documentToReview);

  // Al tratarse de un servicio async, retorna un VOID
  public void execute(){
    plan.manualExecution(original, documentToReview);
    this.automaticValidation(original, documentToReview);
  }

  public double getCost(){
    return plan.getCost(original,documentToReview);
  }

}
