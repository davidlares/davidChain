package com.davidlares.davidchain;

public class Miner {
	
	// this should contain logic for mining, rewarding and inserting block into the blockChain
	
	private double reward;
	
	public void mine(Block block, BlockChain blockChain) {
	
		while(notGoldenHash(block)) {
			block.generateHash();
			block.incrementNonce();
		}
		
		// printing messages
		System.out.println("Block: " + block + " has just mined.");
		System.out.println("Hash is: " + block.getHash());
	
		// important: add it to the blockChain
		blockChain.addBlock(block);
		reward += Stats.REWARD;
	}
	
	// calculating and comparing hashes (generated hash versus block hash)
	public boolean notGoldenHash(Block block) {
		String leadingZeros = new String(new char[Stats.DIFFICULTY]).replace('\0', '0');
		return !block.getHash().substring(0, Stats.DIFFICULTY).equals(leadingZeros);
	}
	
	// getting the reward 
	public double getReward() {
		return this.reward;
	}
}
