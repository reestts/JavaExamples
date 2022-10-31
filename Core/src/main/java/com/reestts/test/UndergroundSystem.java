package com.reestts.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndergroundSystem {

    // A -> B -> C
    // A -> C != C -> A
    public UndergroundSystem() {

    }

    Map<Integer, List<Voyage>> all = new HashMap<>();

//    // 23 A 20
//    // 25 A 60
//    // 19 A 15
//    public void checkIn(int id, String stationName, int t) {
//        int voyageId = all.values().size();
//        Voyage voyage = new Voyage(voyageId, id, stationName, t));
//        addVoyage(voyageId, voyage);
//    }
//
//    // 23 C 30
//    // 25 C 70
//    // 19 D 80
//    public void checkOut(int id, String stationName, int t) {
//        int voyageId = all.entrySet(entry -> {
//                    entry.getValue.getUserId = id && entry.getValue.getEndStation = null;
//                    return entry.getKey;
//                }
//        );
//        updateVoyage(voyageId, id, stationName, t);
//    }
//
//    // A -> C ((30-20) + (70-60))/2 = 10
//    public double getAverageTime(String startStation, String endStation) {
//        List<Integer> list = all.valueSet.stream()
//                .filter(voyage -> voyage.getStartStation.equals(startStation) && voyage.getEndStation.equals(endStation))
//                .map(voyage -> voyage.getEndTimestamp() - voyage.getStartTimestamp())
//                .collect(toList); // 30-20, 70-60
//
//        int sum;
//        for (int i : list) {
//            sum = sum + i;
//        }
//        return sum() / list.size();
//    }
//
//    public void addVoyage(int voyageId, Voyage voyage) {
//        if (voyage != null) {
//            all.put(voyageId, voyage);
//        }
//    }
//
//    public void updateVoyage(int voyageId, String stationName, int t) {
//        var voyage = all.get(voyageId);
//        voyage.setEndStation(voyage.getEndStation);
//        voyage.setEndTimeStamp(voyage.getEndTimeStamp);
//    }

    class Voyage {
        int userId;
        String startStation;
        String endStation;
        int startTimestamp;
        int endTimestamp;
        boolean isCheckOut;

        private Voyage(final int userId, final String startStation, final String endStation, final int startTimestamp, final int endTimestamp, final boolean isCheckOut) {
            this.userId = userId;
            this.startStation = startStation;
            this.endStation = endStation;
            this.startTimestamp = startTimestamp;
            this.endTimestamp = endTimestamp;
            this.isCheckOut = isCheckOut;
        }
    }
}
