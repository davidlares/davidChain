# davidChain

This repo consist on a simple Java CLI implementation of blockchain concepts, conformed by Miners, Blocks and Blockchain object instances for a complete simulated a full mining and hashing experience using the **SHA256** hashing process.

This script contains a lot of internal terms for blockchain. Each file will represent a particular element inside a common architecture for representing a PoW blockchain environment.

### Files

1. **Main.java**: this file handle the whole execution, including blocks, miner and a full blockchain instance
2. **Block.java**: this file represents the fundamental built-in block over the blockchain itself. Contains the block content (id, nonces, timestamps, hash values (previous and actual) and the transaction value)
3. **Blockchain.java**: this one store the blocks in a array list (java native data structure)
4. **Stats.java**: this simple file provide the configuration for the genesis block, the miner reward and the hashing difficulty.

5. **SHA256.java**: this is a helper java class that converts the transaction information into a **SHA256** (256 bits) hash. This is implemented by using the Java built-in class **java.security.MessageDigest**, basically this helper convert the block information into a hexadecimal String

6. **Miner.java**: the profit side of the blockchain and mining role is to generate some profit or any reward after handling and verifying transactions

### Typical Block content

1. Block ID.
2. Transactions(s)
3. Merkle root (identifies all the transactions within a given block)
4. Hash (hash)
5. Previous hash
6. Nonce (number only use once)
7. Timestamp (actual time of creation)

The blockchain itself is a linked list with hash-pointers Every node in the blockchain has 2 hash values: own hash and the hash value of the previous block

Blocks from a linked list is where the nodes are cryptographically linked together

### How do we generate hashes?

We use all the information present in the block to feed this data to the **SHA256** for getting the 64 bit hexadecimal string. All the block data is need but most of the data is immutable,  **SHA256** is a pretty good and solid hashing algorithm, but the main feature of this hash is that is deterministic, this refers to having the same output if we apply the same hash-function (it's not unique by itself).

We have to change something for changing the hash value and for that, we use the nonce value of the block.

### The nonce value

Nonce stands for: Number only used once

This value is a 32 bits unsigned integer that during the mining process it changes to every possible value and get a new SHA256 hash for evaluation.

Miners cannot guess the value of the nonce because every time you compare hashes is incremented by one until it finds the goldenHash which determines the number of leading zeros present on the hash.

## Credits

- [David E Lares](https://twitter.com/davidlares3)
