package com.saptarshi.java.design.creational.singleton;

public class SingletonPatternDemo implements Runnable {

	private SingletonApproach approach;
	private static final int MAX_THREADS = 10;

	public void demo(SingletonApproach approach) {
		this.approach = approach;

		for (int i = 1; i <= MAX_THREADS; i++) {
			new Thread(this).start();
		}
	}

	public ISingleton getInstanceUsingApproach() {
		switch (approach) {
			case EAGER_INITIALIZATION:
				return EagerInitializationSingleton.getInstance();
			case LAZY_INITIALIZATION:
				return LazyInitializationSingleton.getInstance();
			case THREAD_SAFE_SYNCHRONIZED:
				return ThreadSafeSingleton.getInstance();
			case THREAD_SAFE_SYNCHRONIZED_DOUBLE_LOCKING:
				return ThreadSafeSingleton.getInstanceUsingDoubleCheckedLocking();
			case BILL_PUGH:
				return BillPughSingleton.getInstance();
		}

		return null;
	}

	@Override
	public void run() {
		ISingleton instance = getInstanceUsingApproach();
		System.out.println(Thread.currentThread().getName() + " Created Singleton Instance using " + approach + " method. Object Hashcode = " + instance.hashCode());
	}

	public static void main(String[] args) {

		/*
		 * Run only one approach at a time to see the result. Keep others commented.
		 * LAZY_INITIALIZATION approach will create more than one object. Object hash codes will differ. 
		 */

		SingletonPatternDemo singleton = new SingletonPatternDemo();
		singleton.demo(SingletonApproach.BILL_PUGH);
		// singleton.demo(SingletonApproach.EAGER_INITIALIZATION);
		// singleton.demo(SingletonApproach.LAZY_INITIALIZATION);
		// singleton.demo(SingletonApproach.THREAD_SAFE_SYNCHRONIZED);
		// singleton.demo(SingletonApproach.THREAD_SAFE_SYNCHRONIZED_DOUBLE_LOCKING);
	}

}
