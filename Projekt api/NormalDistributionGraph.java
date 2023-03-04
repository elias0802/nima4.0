package edu.fra.uas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name = "NormalDistributionGraph")
public class NormalDistributionGraph {
	private static final Logger log = LoggerFactory.getLogger(NormalDistributionGraph.class);
	@Id
	@GeneratedValue
	private long id;

	// Definition of data fields for the x and y values
	@Column(name = "mean")
	private Float Mean;

	@Column(name = "sD")
	private Float SD;

	@Column(name = "x")
	private Float X;

	public NormalDistributionGraph() {

	}

	// Constructor to initialize data fields for x and y values
	public NormalDistributionGraph(Float mean, Float sD, Float x) {
		super();
		Mean = mean;
		SD = sD;
		X = x;

	}
	// getters and setters

	public long getId() {
		log.debug("getId");
		return id;
	}

	public void setId(long id) {
		log.debug("setId");
		this.id = id;
	}

	public Float getMean() {
		log.debug("getMean");
		return Mean;
	}

	public void setMean(Float mean) {
		log.debug("setMean");
		Mean = mean;
	}

	public Float getSD() {
		log.debug("getSD");
		return SD;
	}

	public void setSD(Float sD) {
		log.debug("setSD");
		SD = sD;
	}

	public Float getX() {
		log.debug("getX");
		return X;
	}

	public void setX(Float x) {
		log.debug("setX");
		X = x;
	}

}
