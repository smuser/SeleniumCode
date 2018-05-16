
public class Myswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 95;
	switch(score)
	{
	case 150: System.out.println("Grade A");
			  break;
	case 100:
	case 95:  //same switch statemtn is used i.e. mulipe conditions evaluate without break
	case 90:  System.out.println("Grade B");
			  break;
	case 70: System.out.println("Grade C");
			  break;
	default: System.out.println("Not Valid Grade. Please try again.");
			  break;
	}
	}

}
