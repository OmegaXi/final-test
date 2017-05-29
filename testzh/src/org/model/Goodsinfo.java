package org.model;

/**
 * Goodsinfo entity. @author MyEclipse Persistence Tools
 */

public class Goodsinfo implements java.io.Serializable {

	// Fields

	private Integer goodsid;
	private String goodsname;
	private Long goodsprice;

	// Constructors

	/** default constructor */
	public Goodsinfo() {
	}

	/** minimal constructor */
	public Goodsinfo(Integer goodsid) {
		this.goodsid = goodsid;
	}

	/** full constructor */
	public Goodsinfo(Integer goodsid, String goodsname, Long goodsprice) {
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.goodsprice = goodsprice;
	}

	// Property accessors

	public Integer getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(Integer goodsid) {
		this.goodsid = goodsid;
	}

	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public Long getGoodsprice() {
		return this.goodsprice;
	}

	public void setGoodsprice(Long goodsprice) {
		this.goodsprice = goodsprice;
	}

}