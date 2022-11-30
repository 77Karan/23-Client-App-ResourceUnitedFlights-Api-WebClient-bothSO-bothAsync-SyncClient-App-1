package in.ashokit.binding;

import lombok.Data;

@Data
public class FlightInfo 
{
	private String code;
	private Integer price;
	private String origin;
	private String destination;
	private String departureDate;
	private String planeType;
    private String airlineName;
    private Integer emptySeats;

}
