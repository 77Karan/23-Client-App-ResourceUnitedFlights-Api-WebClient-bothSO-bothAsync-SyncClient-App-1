package in.ashokit.response;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.binding.Flight;

@Service
public class SyncResponseService 
{
	
	//Representing JSON RESPONSE in STRING
	public void getResponseInStrig()
	{
		WebClient webClient = WebClient.create();
		String url = "http://mu.mulesoft-training.com/essentials/united/flights/";
	String body   =  webClient.get()
		            .uri(url)
		            .accept(MediaType.APPLICATION_JSON)
		            .retrieve()
		            .bodyToMono(String.class)
		            .block();
		System.out.println(body);

	}
	
	
	//REPRESENTING JSON RESPONSE IN Object
	public void getResponseInObject()
	{
		WebClient webClient = WebClient.create();
		String url = "http://mu.mulesoft-training.com/essentials/united/flights/";
       Flight flight = webClient.get()
		            .uri(url)
		            .accept(MediaType.APPLICATION_JSON)
		            .retrieve()
		            .bodyToMono(Flight.class)
		            .block();
		System.out.println(flight.getFlights());
	}

}
