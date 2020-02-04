package csce247.assignments.decorator;
public class Lights extends TreeDecorator{
	ChristmasTree tree;
	public Lights(ChristmasTree tree) {
		this.tree=tree;
	}
	public String toString() {
		return tree.toString()+"+ strings of lights";
	}
	public double getCost() {
		return tree.getCost()+2;
	}
}
