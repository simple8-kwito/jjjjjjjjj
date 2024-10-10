package voting;

import java.util.*;

public class Voting {

	public static void main(String[] args) {
	
List<String>names=new ArrayList<>();
names.add("JOhn");
names.add("Mukasa");
names.add("Setonga");
names.add("Mark");
names.add("Zaka"); 
names.add("Uganda");
names.add("Water");
names.add("Derick");
names.add("Alice"); 
char startLetter='A';
char endLetter='Z';
Collections.sort(names);
System.out.println("names in alphabetical order between "+startLetter+"and"+endLetter +"):");
for (String name:names) {
	char firstLetter=name.charAt(0);
	if(firstLetter<=startLetter&& firstLetter<=endLetter);{
		System.out.println(name);
	}

	
}
	}

}
