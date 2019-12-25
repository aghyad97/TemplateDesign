package lab13;

public class ProduceCar extends ToyFactory{

	@Override
	void FixMold() {
		// TODO Auto-generated method stub
		System.out.println("Fix the mold for producing car");

	}

	@Override
	void Pack() {
		// TODO Auto-generated method stub
		System.out.println("Pack the car product");
	}

	@Override
	void FixWheels() {
		// TODO Auto-generated method stub
		System.out.println("Fix 4 wheels - 2 in front axle and 2 in back axle to the car ");
	}

	@Override
	void Cool() {
		// TODO Auto-generated method stub
		System.out.println("Cool the car product for 1 minute");
	}

}
