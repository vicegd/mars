package robot

enum TimeUnit {
	hour('h', 3600),
	minute('m', 60),
	second('s', 1)
	
	String abbreviation
	double multiplier
	
	TimeUnit(String abbr, double mult) {
		this.abbreviation = abbr
		this.multiplier = mult
	}
	
	String toString() {
		this.abbreviation
	}
}
