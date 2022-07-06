package domain;

public interface Plan {
  void manualExecution(Document original, Document documentToReview);
  double getCost(Document original, Document documentToReview);
}
