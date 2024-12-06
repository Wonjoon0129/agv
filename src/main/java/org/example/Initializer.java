package org.example;

import org.example.entity.Agv;
import org.example.entity.Trs;

import java.util.*;
import java.util.stream.Collectors;

// 初始化AGV的任务和电池状态
class Initializer {
    private List<Agv> agvs;      // AGV列表
    private List<Trs> tasks;    // 任务列表

    public Initializer(List<Agv> agvs, List<Trs> tasks) {
        this.agvs = agvs;
        this.tasks = tasks;
    }

    public void initialize() {
        // 将任务按照优先级排序（高优先级在前）
        tasks.sort(Comparator.comparingInt(t -> (int) t.getArrivalTime()));

        // 遍历任务并分配给合适的AGV
        for (Trs task : tasks) {
            for (Agv agv : agvs) {
                if(checkCapabilityMatch(agv.getCapability(),task.getCapability()))
                {
                    agv.setSchedule(new ArrayList<Trs>());
                    agv.getSchedule().add(task);
                    System.out.println("Task " + task.getId() + " assigned to AGV " + agv.getAgvidf());
                    break;
                }

            }
        }

    }

    private boolean checkCapabilityMatch(String trsCapability, String agvCapability) {
        // 判断 AGV 的能力是否满足 TRS 的要求
        HashSet<String> strings = new HashSet<>(Arrays.asList(trsCapability.split(",")));
        HashSet<String> strings1 = new HashSet<>(Arrays.asList(agvCapability.split(",")));
        if (strings.containsAll(strings1)) {
            return true;
        }
        return false;
    }
}
