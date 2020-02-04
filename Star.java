package csce247.assignments.decorator;
public class Star extends TreeDecorator{
	ChristmasTree tree;	
	public Star(ChristmasTree tree) {
		this.tree=tree;
	}
	public String toString() {
		return tree.toString()+" + a star on top";
	}
	public double getCost() {
		return tree.getCost()+6;
	}
}
