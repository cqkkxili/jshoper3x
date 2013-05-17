package com.jshop.entity;

// Generated 2013-5-17 21:49:25 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * LocationT generated by hbm2java
 */
@Entity
@Table(name = "location_t", catalog = "jshoper3")
public class LocationT implements java.io.Serializable {

	private String lid;
	private String userid;
	private String username;
	private double lat;
	private double lng;
	private int zoom;
	private int versiont;

	public LocationT() {
	}

	public LocationT(String lid, String userid, String username, double lat,
			double lng, int zoom, int versiont) {
		this.lid = lid;
		this.userid = userid;
		this.username = username;
		this.lat = lat;
		this.lng = lng;
		this.zoom = zoom;
		this.versiont = versiont;
	}

	@Id
	@Column(name = "LID", unique = true, nullable = false, length = 20)
	public String getLid() {
		return this.lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	@Column(name = "USERID", nullable = false, length = 20)
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Column(name = "USERNAME", nullable = false, length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "LAT", nullable = false, precision = 22, scale = 0)
	public double getLat() {
		return this.lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	@Column(name = "LNG", nullable = false, precision = 22, scale = 0)
	public double getLng() {
		return this.lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	@Column(name = "ZOOM", nullable = false)
	public int getZoom() {
		return this.zoom;
	}

	public void setZoom(int zoom) {
		this.zoom = zoom;
	}

	@Column(name = "VERSIONT", nullable = false)
	public int getVersiont() {
		return this.versiont;
	}

	public void setVersiont(int versiont) {
		this.versiont = versiont;
	}

}
