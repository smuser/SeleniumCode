//Use of Class an Objects
public class MyClassStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//e g creating obj mark which is instance of student class
		Student mark = new Student(); 
		//This type of code will allow security issue and hence we should use geter n setter 
		/*mark.id=1;
		mark.name ="Mathew";
		mark.age=20;*/
		mark.setId(1);
		mark.setName("Mathew");
		mark.setAge(25);
		System.out.println(mark.name +" ID is "+mark.id+" and is "+mark.age+" years old.");
	}

}
