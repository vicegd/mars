import robot.Direction
import robot.Robot
import robot.Distance
import robot.DistanceUnit
import robot.Time
import robot.TimeUnit

my_robot = new Robot()

def binding = new Binding([
	robot : my_robot,
	left: Direction.left,
	right: Direction.right,
	backward: Direction.backward,
	forward: Direction.forward,
	move: my_robot.&move,
	h: new Time(1, TimeUnit.hour),
	m: new Time(1, TimeUnit.minute),
	s: new Time(1, TimeUnit.second)
])

Number.metaClass.getCm = { -> 
	new Distance(delegate, DistanceUnit.centimeter)
}

Number.metaClass.getM = { ->
	new Distance(delegate, DistanceUnit.meter)
}

Number.metaClass.getKm = { ->
	new Distance(delegate, DistanceUnit.kilometer)
}

shell = new GroovyShell(binding)
shell.evaluate(
	new File("src/command.groovy")
)