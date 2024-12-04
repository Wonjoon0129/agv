package org.example.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.LinkedTransferQueue;

@Data
public class Agv implements Serializable {
    List<Trs> schedule;
    double agvidf;
    double startNode;
    String capability;
    double speed;
    double charge;
    double dischargeRate;
    double chargingRate;
    double travelCost;
    double lowerThreshold;
    double upperThreshold;
    double capacity;
    double batteryLevel;

}
