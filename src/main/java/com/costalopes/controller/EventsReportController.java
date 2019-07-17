package com.costalopes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.costalopes.model.Event;

@RestController
public class EventsReportController {

	@RequestMapping("/events")
	public List<Event> getEvents() {
		
		Event event1 = new Event();
		event1.setName("Java User Group");
		Event event2 = new Event();
		event2.setName("Angular User Group");
		
		List<Event> eventsList = new ArrayList<>();
		eventsList.add(event1);
		eventsList.add(event2);
		
		return eventsList;
	}
	
}
