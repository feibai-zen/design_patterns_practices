package com.feibai.study.designpatterns.proxy.proxydynamic3;

public class DynamicProxyClient {
    public static void main(String[] args) {
        DynamicProxy factory = new DynamicProxy(new CalculatorImpl());
        Calculator proxy = (Calculator) factory.getProxy();
        proxy.div(1, 1);
    }
}
