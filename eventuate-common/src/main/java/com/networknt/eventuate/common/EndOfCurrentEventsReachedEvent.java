package com.networknt.eventuate.common;

public class EndOfCurrentEventsReachedEvent implements Event {

  private String entityType;
  private int swimlane;

  @Override
  public String toString() {
    return "EndOfCurrentEventsReachedEvent{" +
            "entityType='" + entityType + '\'' +
            ", swimlane=" + swimlane +
            '}';
  }

  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public int getSwimlane() {
    return swimlane;
  }

  public void setSwimlane(int swimlane) {
    this.swimlane = swimlane;
  }
}



