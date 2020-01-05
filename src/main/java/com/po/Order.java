package com.po;
/**
 * 订单表
 * @author 清越
 *
 */
public class Order {
	private Integer id;  //订单编号
	private Integer busertable_id; //用户ID 主键
	private Double amount;  //订单金额
	private Integer status;  //订单状态
	private String orderdate;  //下单时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBusertable_id() {
		return busertable_id;
	}
	public void setBusertable_id(Integer busertable_id) {
		this.busertable_id = busertable_id;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
}
