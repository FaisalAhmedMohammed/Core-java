package in.ahmed.co;

/* Here we don't get any ambiguity problem because interface dont have any constructor
 * if there is a variable in interface we have to initialize it at the time of creation only otherwise we wil
 *  get compile error    after words we can't initialize it because it don't have any constructor*/
interface MyInter1 {
	void m1();

	void m2();

	int i = 10;

}

interface MyInter2 {

}

interface MyInter3 extends MyInter2, MyInter1 {

}

public class MultipleInterfaces {

}
