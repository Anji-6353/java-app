package com.spring.irctc.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.irctc.request.PassengerDetails;
import com.spring.irctc.request.TicketInfo;

@RestController
public class TicketRestController {
	@PostMapping(value = "/ticket", produces = { "application/json" }, consumes = { "application/json" })
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerDetails request) {
		System.out.println(request);
		TicketInfo info = new TicketInfo();
		info.setTname("Palnadu Express");
		info.setPnr(99494658787l);
		info.setStatus("Booked");
		return new ResponseEntity<>(info, HttpStatus.CREATED);

	}
	@PutMapping("/updatepassenger")
	public ResponseEntity<String> updatePassenger(@RequestBody PassengerDetails request){
		System.out.println(request);
		return new ResponseEntity<>("Passenger updated", HttpStatus.OK);
	}
	@DeleteMapping("/delete/{pname}")
	public ResponseEntity<String> deletePassenger(@PathVariable("pname") String pname){
System.out.println(pname);
		return new ResponseEntity<>("Passenger deleted", HttpStatus.OK);
	}
	@GetMapping("/ticket/{pname}")
	public ResponseEntity<TicketInfo> getTicket(@PathVariable("pname") String pname){
System.out.println(pname);
TicketInfo info = new TicketInfo();
info.setTname("Palnadu Express");
info.setPnr(99494658787l);
info.setStatus("Booked");
		return new ResponseEntity<>(info, HttpStatus.OK);
	}
	
}
