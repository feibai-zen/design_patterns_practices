package com.feibai.study.designpatterns.command;

/**
 * 真正的命令的执行者
 * 
 * @author feibai
 *
 */
public class Receiver {
	public void action() {
		System.out.println("Receiver.action()");
	}
}
