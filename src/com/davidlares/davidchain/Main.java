package com.davidlares.davidchain;

public class Main {

	public static void main(String[] args) {
		System.out.println("Blockchain - davidChain");
		
		// BlockChain instance
		BlockChain blockChain = new BlockChain();
		
		// Miner
		Miner miner = new Miner();
		
		// Creating a block
		Block genesis = new Block(0, "Genesis transaction", Stats.GENESIS);
		// adding the genesis 
		miner.mine(genesis, blockChain);
		// creating a new block 
		Block b1 = new Block(1, "First transaction", blockChain.getBlockChain().get(blockChain.size() - 1).getHash());
		// adding the block to the blockChain
		miner.mine(b1, blockChain);
		Block b2 = new Block(2, "Second transaction", blockChain.getBlockChain().get(blockChain.size() - 1).getHash());
		// adding the block to the blockChain
		miner.mine(b2, blockChain);
		Block b3 = new Block(3, "Third transaction", blockChain.getBlockChain().get(blockChain.size() - 1).getHash());
		// adding the block to the blockChain
		miner.mine(b3, blockChain);
		
		System.out.println("==============================");
		System.out.println("Blockchain Result: \n" + blockChain);
		System.out.println("The miner reward is: " + miner.getReward());
	}	

}
