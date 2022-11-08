package com.api.secondService.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/secondservice")
public class SecondServiceController {

	@GetMapping("/message")
	public String test() {
		return "secondservice conected";
	}
}
