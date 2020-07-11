package com.mmm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@ToString
public class Order implements Serializable {
	private String itemId;
	private String id;
	private Integer money;
	private Integer paymoney;
	private Integer status;
	private Integer num;
	private String username;
	private String couponsId;

	//状态改变时，执行不同的行为
	private State state;
	public Order() {
		this.state = null;

	}


}