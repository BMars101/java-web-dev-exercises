package exercises.controlFlowAndCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Create a system that takes in student names and id numbers.


public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Double> studentData = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        Double studentId;
        System.out.println("Enter student details or (ENTER) to finish: ");

        do {
            System.out.println("Enter student name: ");
            newStudent = input.nextLine();

            if(!newStudent.equals("")){
                System.out.println("Enter student ID: ");
                studentId = input.nextDouble();
                studentData.put(newStudent, studentId);

                input.nextLine();
            }
        }while(!newStudent.equals(""));


        for(Map.Entry<String, Double> student : studentData.entrySet()){
            System.out.println("Name: " + student.getKey() + " ID: " + student.getValue());
        }
    }
}
