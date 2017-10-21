package robot

import groovy.transform.TupleConstructor

@TupleConstructor
class Distance {
	double amount
	DistanceUnit unit
	
	String toString() {
		"$amount $unit"
	}
	
	Speed div(Time t) {
		new Speed(this, t)
	}
}
