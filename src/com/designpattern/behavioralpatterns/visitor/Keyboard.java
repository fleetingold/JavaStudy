package com.designpattern.behavioralpatterns.visitor;

public class Keyboard implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		// TODO Auto-generated method stub
		computerPartVisitor.visit(this);
	}
}