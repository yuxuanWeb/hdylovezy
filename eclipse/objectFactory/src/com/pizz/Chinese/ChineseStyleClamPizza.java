package com.pizz.Chinese;

import com.pizz.Pizza;

public class ChineseStyleClamPizza extends Pizza{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("开始制作Chinese风味的ClamPizza");
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("烘烤10分钟");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("切成0.5cm的小片");
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("包装上Chinese的Clam风味的盒子");
	}
}
