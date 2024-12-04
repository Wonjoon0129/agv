package org.example.entity;

import lombok.Data;

@Data
public class Trs {
    double Id;
    double ArrivalTime;
    double source;
    double target;
    double ept;
    double ldt;
    String capability;
    double requestCost;
}
