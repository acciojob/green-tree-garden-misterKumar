package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Garden {
	 private List<Tree> trees;

	    public Garden() {
	       // your code goes here
			trees=new ArrayList<>();
	    }

	    public void plantTree(Tree tree) throws InvalidTreeException {
	        // your code goes here
			if (tree == null || tree.getName() == null || tree.getName().isEmpty()) {
				throw new InvalidTreeException("Invalid tree");
			}
			trees.add(tree);
	    }

	    public List<Tree> getTrees() {
	    	// your code goes here
	        return trees;
	    }
}
