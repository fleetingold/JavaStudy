package com.designpattern.flyweight;

import java.util.HashMap;

import com.designpattern.factory.Circle;
import com.designpattern.factory.Shape;

public class ShapeFactory {
	private static final HashMap<String, Shape> circleMap = new HashMap<>();
	
	public static Shape getCircle(String color) {
		Circle circle = (Circle)circleMap.get(color);
		
		if(circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}
}
