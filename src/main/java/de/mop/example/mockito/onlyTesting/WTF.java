package de.mop.example.mockito.onlyTesting;

public class WTF {

	Adder adder;
	
	public Integer increase(Integer in){
		return this.adder.addOne(in);
	}

	public Adder getAdder() {
		return adder;
	}

	public WTF setAdder(Adder adder) {
		this.adder = adder;
		return this;
	}
	
}
