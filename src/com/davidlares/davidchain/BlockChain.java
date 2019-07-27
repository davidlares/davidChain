package com.davidlares.davidchain;

import java.util.ArrayList;
import java.util.List;

// Blockchain = Block sequences

public class BlockChain {
	
	// Linked List data structure of Block objects
	private List<Block> blockChain;
	
	public BlockChain() {
		// constructor
		this.blockChain = new ArrayList<>();
	}
	
	// methods 
	public void addBlock(Block block) {
		this.blockChain.add(block);
	}
	
	// returning all blocks
	public List<Block> getBlockChain() {
		return this.blockChain;
	}
	
	// ArrayList size method
	public int size() {
		return this.blockChain.size();
	}
	
	// Overriding object instance
	@Override
	public String toString() {
		String blockChain = "";
		for(Block block: this.blockChain) {
			blockChain += block.toString() + "\n";
		}
		return blockChain;
	}
}
