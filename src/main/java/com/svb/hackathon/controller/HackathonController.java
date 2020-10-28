package com.svb.hackathon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.databind.JsonNode;
import com.svb.hackathon.dto.ClientsFinancial;
import com.svb.hackathon.dto.ClientsFinancials;
import com.svb.hackathon.dto.Cost;
import com.svb.hackathon.dto.rasa.RasaRequest;
import com.svb.hackathon.dto.rasa.RasaResponse;
import com.svb.hackathon.dto.rasa.Response;
import com.svb.hackathon.service.HackathonService;

@Controller
public class HackathonController {

	@Autowired
	HackathonService service;
	
	
	@GetMapping("/v1/clients/{clientId}/financial")
	public ResponseEntity<Response> getFundingDate(@PathVariable String clientId) {
		System.out.print("Client Id :" + clientId);
		Response resp = new Response();
		resp.setText("Jan 2022");
		
		service.getNextFundingDate(clientId);
		
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}
	
}
