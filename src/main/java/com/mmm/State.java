package com.mmm;

public interface State {
	/***
	 * 变更状态
	 * @param order
	 */
	void doAction(Order order);
	/***
	 * 执行行为
	 */
	void execute();
}
