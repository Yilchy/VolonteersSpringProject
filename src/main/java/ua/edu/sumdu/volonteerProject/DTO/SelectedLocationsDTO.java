package ua.edu.sumdu.volonteerProject.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import ua.edu.sumdu.volonteerProject.model.LocationCoordinates;

import java.sql.Timestamp;
import java.util.List;

@AllArgsConstructor
@Data
public class SelectedLocationsDTO {
    private String adminUsername;
    private List<LocationCoordinates> coordinatesList;
    private Timestamp timeOfDelivering;
    private long amountOfPoints;
    private String cityName;

}
