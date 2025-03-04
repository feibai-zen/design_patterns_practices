package com.feibai.study.designpatterns.proxy.proxydynamic1;

/**
 * 模拟动态生成的代理的结构，使用动态代理类最终都会调用invoke()方法
 * 在动态代理模式中没有使用这个类
 *
 * @author feibai
 */
public class ProxyStar implements Star {

  StarHandler handler;

  public ProxyStar(StarHandler handler) {
    super();
    this.handler = handler;
  }

  public void bookTicket() {
//		handler.invoke(this, 当前方法, args);
  }

  public void collectMoney() {
//		handler.invoke(this, 当前方法, args);
  }

  public void confer() {
//		handler.invoke(this, 当前方法, args);
  }

  public void signContract() {
//		handler.invoke(this, 当前方法, args);
  }

  public void sing() {
//		handler.invoke(this, 当前方法, args);
  }

}
