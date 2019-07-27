package com.davidlares.davidchain;
import java.util.Date;

//Block structure for blockchain.

public class Block {
	
	private int id;
	// number only used once - used for calculate and generate hashes
	private int nonce;
	// this will be used for registering the block time creation
	private long timeStamp;
	// hash structure
	private String hash;
	private String prevHash;
	private String transaction;
	
	// constructor 
	public Block(int id, String transaction, String prevHash) {
		this.id = id;
		this.transaction = transaction;
		this.prevHash = prevHash;
		// setting a unique time creation for the Block
		this.timeStamp = new Date().getTime();
		generateHash(); // generating block hash for mining
	}
	
	// getters and setters
	
	public String getHash() {
		return this.hash;
	}
	
	public void setHash(String hash) {
		this.hash = hash;
	}
	
	public String getPrevHash() {
		return this.prevHash;
	}
	
	public void setPrevHash(String prevHash) { 
		this.prevHash = prevHash;
	}
	
	// custom methods
	
	public void incrementNonce() {
		this.nonce ++; // incremented when miner tries to find the goldenHash
	}
	
	public void generateHash() {
		String dataToHash = Integer.toString(id) + prevHash + Long.toString(timeStamp) + Integer.toString(nonce) + transaction.toString();
		// this dataToHash should be "encrypted" by SHA256
		this.hash = dataToHash; // this will change
	}
	
	@Override
	public String toString() {
		return this.id + this.transaction + " - " + this.hash + " - " + this.prevHash + " - ";
	}
}
