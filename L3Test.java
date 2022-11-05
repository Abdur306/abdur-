import java.util.*;
class L3Test{
	public static void main(String[] args){
		Hospital hos=new Hospital();
		hos.Old();
	}
}
class Hospital{
	static Scanner scan = new Scanner(System.in);
	private int PId[]=new int[3];
	private String PName[]=new String[3];
	private int InTime[]=new int[3];
	private int OutTime[]=new int[3];
	static int id=680,j=0;
	public void Old(){
		System.out.println("Enter the Patient ID: ");
		int lId=scan.nextInt();
		System.out.println("Enter the Patient Name: ");
		String LName=scan.next();
		for(int i=0;i<PId.length;i++){
			if(lId==PId[i]&& LName.equals(PName[i])){
				PDetails();
				break;
			}
			else if(i==PId.length-1){
				System.out.println("No record found");
				NewPatient();
				break;
			}
		}
	}
	public void UserChoose(){
		System.out.println("1.New Patient || 2.Display ");
		int userInput=scan.nextInt();
		switch(userInput){
			case 1:
			Old();
			break;
			case 2:
			display();
			break;
			default :
			System.out.println("invalid input");
		}
	}
	public void NewPatient(){
		PId[j]=id;
		//System.out.println("New Patient id: "+id);
		System.out.println("Enter the Patient Name: ");
		PName[j]=scan.next();
		id++;
		PDetails();
	}
	public void PDetails(){
		System.out.println("Enter the Patient In Time: ");
		InTime[j]=scan.nextInt();
		System.out.println("enter the patient out Time");
		OutTime[j]=scan.nextInt();
		j++;
		UserChoose();
	}
	public void display(){
		System.out.println("pid \t"+"PNmae \t"+"InTime \t"+"OutTime \t");
		for(int i=0;i<PName.length;++i){
		System.out.println(PId[i] +"\t"+PName[i] +"\t"+InTime[i]+ "\t"+OutTime[i]+"\t");
		//break;
		}
		
	}
	public void waiting_time(){
		for(int i=0;i<in)
	}
}