package company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

class developer extends employee{
	
	private String speciality;
	
	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	developer(String fName, String lName, int sal, String Special) {
		super(fName, lName, sal);
		this.speciality = Special;
	}
	
}

class manager extends employee{
	
	ArrayList<developer> team = new ArrayList<developer>();
	
	manager(String fName, String lName, int sal, developer teams) {
		super(fName, lName, sal);
		this.team.add(teams);
	}
	
	public void addTeam(developer name) {
		this.team.add(name);
	}
	
	public void removeTeam(developer name) {
		this.team.remove(name);
	}
	
	public ArrayList<developer> showTeam() {
		ArrayList<developer> devList = new ArrayList<developer>();
		ListIterator<developer> teamLoop = team.listIterator();
		while(teamLoop.hasNext()) {
			
			devList.add(teamLoop.next());
			
		}
		return devList;
	}
	
	
}

public class emp {

	public static void main(String[] args) {
		developer dev1 = new developer("Mark", "Juma", 67000, "Java");
		developer dev2 = new developer("Luke", "Simiyu", 65600, "Python");
		developer dev3 = new developer("John", "Wekesa", 61110, "PHP");
		
		manager man1 = new manager("Titus", "Barua", 998870, dev1);
		
		man1.addTeam(dev2);
		man1.addTeam(dev3);
		
		man1.removeTeam(dev2);
		
		ArrayList<developer> devTeam = man1.showTeam();
		ListIterator<developer> devLoop = devTeam.listIterator();
		
		while(devLoop.hasNext()) {
			System.out.println(devLoop.next().getEmail());
		}
		

	}

}
