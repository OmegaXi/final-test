package org.model;

/**
 * Offerinfo entity. @author MyEclipse Persistence Tools
 */

public class Offerinfo implements java.io.Serializable {

	// Fields

	private Integer offerid;
	private Integer userid;
	private Integer goodsid;
	private Integer number;

	// Constructors

	/** default constructor */
	public Offerinfo() {
	}

	/** minimal constructor */
	public Offerinfo(Integer offerid) {
		this.offerid = offerid;
	}

	/** full constructor */
	public Offerinfo(Integer offerid, Integer userid, Integer goodsid,
			Integer number) {
		this.offerid = offerid;
		this.userid = userid;
		this.goodsid = goodsid;
		this.number = number;
	}

	// Property accessors

	public Integer getOfferid() {
		return this.offerid;
	}

	public void setOfferid(Integer offerid) {
		this.offerid = offerid;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(Integer goodsid) {
		this.goodsid = goodsid;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

}