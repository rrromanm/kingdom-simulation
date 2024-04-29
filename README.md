<h1 align='center'>Assigmment 4, SDJ2 <br> (Singleton, Proxy, Adapter, JUnit, Producer-Consumer, Readers-Writers) </h1>

<h3>The assignment:</h3>
<p>
You must design and implement the Kingdom simulation shown. The goal is to get valuables, so the king can throw parties. <br> <br>

The King has a Treasure room with the door guarded buy a Guardsman. The valuables in the Treasure room comes from a Mine with Miners transporting their findings to a Deposit. Occasionally, Valuable Transporters are moving valuables from Deposit to the Treasure room and Accountants are counting all valuables in the Treasure room. When the King feels like partying, he takes valuables from the Treasure room if there are enough for a party.
</p>

<h3>Requirements: </h3>
<p>
 - Threads to simulate the actors: King, Accountants, ValuableTransporter and ValuablesMiner. <br>
 - Singleton to log any action, e.g. when an actor waits or perform a job. <br>
 - Multiton for different types of Valuables, e.g. Diamond, GoldNugget, Jewel, Ruby, WoodenCoin. <br>
 - Adapter for the ArrayList in the Deposit. Adapter should have a Queue interface. <br>
 - Producer-Consumer for the Deposit with the Miners and Valuables Transporters being producers and consumers, respectively. <br>
 - Readers-Writers for the Treasure room and Guardsman. <br>
 - Proxy between the Treasure room and the Guardsman. <br> <br>

1. JUnit testing the ArrayList is independent of the rest and could be done at any time. There are some errors, but they may not influence in your use of it.

2. Singleton could be first step. Create a log method with a simple printout.

3. Valuable next step – use multiton pattern

4. Adapter for a blocking queue Deposit delegating to the ArrayList given

5. Producer-Consumer creating two Runnable classes Miner and ValuableTransporter and the Deposit as the shared resource. Remember to use the Singleton to print out when a Miner or ValuableTransporter are waiting and working (in class Deposit).
   
6. Test this part in a main method with a Deposit, a couple of Miners and a couple of ValuableTransporters

7. Proxy

8. Reader/writers
</p>

