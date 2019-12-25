package lab13;

public abstract class ToyFactory {
	void ProduceToy(){
		FixMold();
		FeedRaw();
		HeatRaw();
		Inject();
		Cool();
		FixWheels();
		Pack();
	}
	abstract void FixMold();
	abstract void Pack();
	abstract void FixWheels();
	abstract void Cool();
	void FeedRaw() {
		System.out.println("Feed poly vinyl chloride powder to the machine");
	}
	void HeatRaw(){
		System.out.println("Heat raw material to 500 degree centigrade");
	}
	void Inject(){
		System.out.println("Inject heated raw material into the mold");
	}

}
