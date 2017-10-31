package backEnd;

import java.util.ArrayList;

public class GStructure implements GHolderI{
	private int[][] myGLayout;
	private ArrayList<GHolderI> myStuff;
	
	public GStructure() {
		myStuff = new ArrayList<GHolderI>();
		myGLayout = new int[0][0];
	}
	
	public void addStuff(GHolderI ghi, Size s, Location l) {
		myStuff.add(ghi);
		calculateGLayout();
	}
	
	private void calculateGLayout() {
		
	}
	
	private int figureLength(Size s, Location l, boolean isx) {
		if(isx) return myGLayout.length>0? 1: 1;
		return 1;
	}
	
	public int[][] getGLayout() {
		return myGLayout;
	}
}
