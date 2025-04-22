package ParallelProgramlama;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class Concurrency {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(10); // newCachedThreadPool();
		Runnable run = () -> System.out.println("ben bir runnable programım");
		Thread t = new Thread(run);
		t.start();
		
		List<Runnable> listOfRunnable = Arrays.asList(
				() -> System.out.println("runnable 1"),
				() -> System.out.println("runnable 2"),
				() -> System.out.println("runnable 3"),
				() -> System.out.println("runnable 4"),
				() -> System.out.println("runnable 5"),
				() -> System.out.println("runnable 6"),
				() -> System.out.println("runnable 7"),
				() -> System.out.println("runnable 8"),
				() -> System.out.println("runnable 9"));
		
		List<Callable<Integer>> listOfCallable = Arrays.asList(
				() -> {int a = 1; System.out.println("callable 1"); return a;},
				() -> {int a = 1; System.out.println("callable 2"); return a;},
				() -> {int a = 1; System.out.println("callable 3"); return a;},
				() -> {int a = 1; System.out.println("callable 4"); return a;},
				() -> {int a = 1; System.out.println("callable 5"); return a;},
				() -> {int a = 1; System.out.println("callable 6"); return a;});

		
		try {
			List<Future<Integer>> results = executor.invokeAll(listOfCallable);
			results.forEach(r -> {
				try {
					System.out.println("result : " +r.get());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		IntStream.range(0,9).forEach(i -> executor.submit(listOfRunnable.get(i)));
		
		IntStream.range(0, 100).forEach(i -> executor.submit( () -> {
			System.out.println("Task " + i + " executed by " + Thread.currentThread().getName());
		}));
		
	}

}











