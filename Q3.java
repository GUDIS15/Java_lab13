package LAB13;

import java.util.TreeSet;

public class Q3 {
	public static void main(String[] args) {
	      TreeSet<Integer> treeSet = new TreeSet<Integer>();
	      treeSet.add(100);
	      treeSet.add(150);
	
	      treeSet.add(250);
	      treeSet.add(655);     
	      treeSet.add(800);
	      treeSet.add(1000);
	      System.out.println("TreeSet Lowest value = " + treeSet.first());
	      System.out.println("TreeSet Highest value = " + treeSet.last());
	   }

}
