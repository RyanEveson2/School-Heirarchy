import java.util.ArrayList;

/**
 * an administrative body that has functions involving classes, students, profs ect...
 */
public class Administration {

    /**
     * returns an arraylist of students who's last name begins with the given character
     * students can be assumed to have only 1 first and last name, separated by a space
     * @param class1 class who's students we are inspecting
     * @param start character we are concerned with
     */
    public ArrayList<Student> orderStudents(UniClass class1, char start){
        ArrayList<Student > list = new ArrayList<>();
        start = Character.toLowerCase(start);
        //TODO: Write the method described above
        Student[] student = class1.getStudents();
        for(int i = 0; i<student.length;i++) {
        	String name = student[i].getName();
        	for(int j = 0; j<student.length;j++) {
        		String[] Lastname = name.split(" ");
        		if(Lastname[1].charAt(0)==start) {
        			list.add(student[i]);
        			 
        		}
        		
        	} 
        	
        	
        }
        return list;
       
    }

    /**
     * compares two lists of students and returns the common students (or set intersection)
     * @param class1 list of students
     * @param class2 second list of students
     */
    public ArrayList<Student> intersection(Student[] class1, Student[] class2){
        ArrayList<Student> list = new ArrayList<>();
        //TODO: alter method to account for empty lists in some way
        for (Student stud1: class1){
            for (Student stud2: class2){
            	if (class1 == null || class2 == null) {
                    return null;
                }
                if(stud1.equals(stud2) && !list.contains(stud1)){
                    list.add(stud1);
                }

            }
        }

        return list;
    }
}
