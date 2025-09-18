package com.feibai.study.designpatterns.command.demo1;

public class CommandClient {
	public static void main(String[] args) {
		Command c = new ConcreteCommand(new Receiver());
		Invoke i = new Invoke(c);
		i.call();

//		new Receiver().action();

	}
}
