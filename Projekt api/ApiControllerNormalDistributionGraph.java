package edu.fra.uas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.fra.uas.model.NormalDistributionGraph;
import edu.fra.uas.repository.NormalDistributionGraphRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping(value = "/api/normalDistributionGraph", produces = MediaType.APPLICATION_JSON_VALUE)
public class ApiControllerNormalDistributionGraph {
	private static final Logger log = LoggerFactory.getLogger(NormalDistributionGraphRepository.class);

	@Autowired
	private NormalDistributionGraphRepository repository;
	
	// GET request to retrieve all normal distribution graph data
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<NormalDistributionGraph>> getAll() {
		log.debug("ApiControllerNormalDistriGET");
		return new ResponseEntity<>(this.repository.findAll(), HttpStatus.OK);
	}

	// POST request to save normal distribution Graph data
	@PostMapping()
	public ResponseEntity<String> saveNormalDistributionGraph(
			@RequestBody NormalDistributionGraph normalDistributionGraph) {
				log.debug("ApiControllerNormalDistriPOST");
		this.repository.save(normalDistributionGraph);
		return new ResponseEntity<>("Standard Normal Distribution Graph is saved", HttpStatus.ACCEPTED);
	}

}
