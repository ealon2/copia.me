package domain;

import lombok.Getter;

public abstract class Service {

  @Getter protected Status status;
  @Getter protected Plan plan;
  @Getter protected Document original, documentToReview;

  public abstract void automaticValidation();

  /**
   * Llamamos simplemente ejecutar, dado que la validación manual
   * nos lleva a pensar necesariamente en asincronismo
   * Y dado que el proceso ahora será asincrónico, el método deberá ser void.
   */
  public void execute(){
    this.automaticValidation();
    plan.manualExecution(this);
  }

  public double getCost(){
    return plan.getCost(original,documentToReview);
  }

}
