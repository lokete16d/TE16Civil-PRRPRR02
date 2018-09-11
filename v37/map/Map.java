package map;

import java.util.ArrayList;

import blocks.Block;
import javafx.scene.Group;

public class Map extends Group {

	private ArrayList<ArrayList<Block>> map = new ArrayList<ArrayList<Block>>();

	public void add(Block b, int row) {
		ArrayList<Block> mapRow;
		try {
			mapRow = map.get(row);
		} catch (IndexOutOfBoundsException e) {
			mapRow = new ArrayList<Block>();
			map.add(mapRow);
		}
		mapRow.add(b);

		this.getChildren().add(b);

	}
	
	public Block getBlock(int x, int y){

		return this.map.get(y).get(x);
		
	}
	
	public double getWidth(){
		return map.get(0).size()*Block.SIZE;
	}
	
	public double getHeight(){
		return map.size()*Block.SIZE;
	}

}