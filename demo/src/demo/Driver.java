package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import static java.util.Comparator.*;

interface Transferable{
	default void transfer(Broker targetExchane){
		System.out.println("transfer in Interface Transferable");
	}
	
}


class Order {
	public void transfer(Broker targetExchane){
		System.out.println("transfer in class Order");
	}
	
	
}
class MarketOrder extends Order implements Transferable{
	

	public void doWork(){
		Broker broker = null;
		
		transfer(broker);
	}
}

public class Driver {

	public static void main(String[] args) throws IOException, InterruptedException {

		int [] array = IntStream.
				range(1,10)
				.toArray();
		
		
		
		Arrays.parallelPrefix(array, (x,y) -> x+y);
			
	Arrays.stream(array)
	.forEach(i->System.out.println(i));
		
		
		
		
		
	}

}
