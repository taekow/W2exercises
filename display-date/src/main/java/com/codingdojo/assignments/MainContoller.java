package com.codingdojo.assignments;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication

@Controller
public class MainContoller {
	
	@RequestMapping("")
	public String indexDateTime() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd");
		SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM");
		SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
		
		// get current date
		Date date = new Date();
		
		String dayString = dayFormat.format(date);
		String dateString = dateFormat.format(date);
		String monthString = monthFormat.format(date);
		String yearString = yearFormat.format(date);
		
		String currentDateString = dayString + ", " + "the " + dateString + " of " + monthString + ", " + yearString;
		
		model.addAttribute("currentDateString", currentDateString);
		
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:a");
		
		Date date = new Date();
		
		String timeString = timeFormat.format(date);
		
		model.addAttribute("timeString", timeString);
		
		return "time.jsp";
	}
}
