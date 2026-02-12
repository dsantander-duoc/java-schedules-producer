
package cl.duoc.schedules_producer.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RouteUpdateDTO implements Serializable {

    private String updateId;
    private String busId;
    private String routeId;
    private String status;
    private LocalDateTime timestamp;

    private double currentLat;
    private double currentLon;

    private List<StopSchedule> revisedSchedules;

}

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
class StopSchedule implements Serializable {
    private String stopId;
    private String stopName;
    private String estimatedArrivalTime;
}