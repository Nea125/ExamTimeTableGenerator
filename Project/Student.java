
package Project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Student {
    public String id,name;
    int n1;
    static ArrayList<Student> studentlist = new ArrayList<>();
    static ArrayList<List<String>> unavailableTimeListDay1 = new ArrayList<>();
    static ArrayList<List<String>> unavailableTimeListDay2 = new ArrayList<>();
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    

    public Student() {
    }
    
    public Student(String id, String name){
        this.id = id;
        this.name = name;
       
    }
    void Input() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Input Number Of Student : ");
        n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\t\t STUDENT[" + (i + 1) + "]");
            System.out.print("Input Student ID  = ");
            String id = sc.nextLine();
            System.out.print("Input Student Name = ");
            String name = sc.nextLine();
            studentlist.add(new Student(id, name));

            // Day 1
            System.out.print("Number Of Unavailable Time Day(1): ");
            int n1 = sc.nextInt();
            sc.nextLine();
            List<String> day1UnavailableTimes = new ArrayList<>();
            for (int j = 0; j < n1; j++) {
                System.out.print("Input Unavailable Time (Day 1) = ");
                String unavailableTime = sc.nextLine();
                day1UnavailableTimes.add(unavailableTime);
            }
            unavailableTimeListDay1.add(day1UnavailableTimes);

            // Day 2
            System.out.print("Number Of Unavailable Time Day(2): ");
            int n2 = sc.nextInt();
            sc.nextLine();
            List<String> day2UnavailableTimes = new ArrayList<>();
            for (int j = 0; j < n2; j++) {
                System.out.print("Input Unavailable Time (Day 2) = ");
                String unavailableTime = sc.nextLine();
                day2UnavailableTimes.add(unavailableTime);
            }
            unavailableTimeListDay2.add(day2UnavailableTimes);
        }
    }
    

    
    void Output() {
        System.out.println("Student Information:");
        for (int i = 0; i < studentlist.size(); i++) {
            Student student = studentlist.get(i);
            System.out.println("Student ID: " + student.getId());
            System.out.println("Student Name: " + student.getName());

            // Day 1
            System.out.println("Day 1 - Unavailable Times:");
            List<String> day1UnavailableTimes = unavailableTimeListDay1.get(i);
            for (String time : day1UnavailableTimes) {
                System.out.println("\t" + time);
            }

            // Day 2
            System.out.println("Day 2 - Unavailable Times:");
            List<String> day2UnavailableTimes = unavailableTimeListDay2.get(i);
            for (String time : day2UnavailableTimes) {
                System.out.println("\t" + time);
            }

            System.out.println(); 
        }
}


public void checkUnavailableStudent() {
        System.out.println("Unavailable Student Information:");
        for (int i = 0; i < studentlist.size(); i++) {
            Student student = studentlist.get(i);
            System.out.println("Student Name: " + student.getName());
            
            // Day 1
            System.out.print("Day 1 - Unavailable Times:");
            List<String> day1UnavailableTimes = unavailableTimeListDay1.get(i);
            for (String time : day1UnavailableTimes) {
                System.out.print("\t"+ time);
            }

            // Day 2
            System.out.print("\tDay 2 - Unavailable Times:");
            List<String> day2UnavailableTimes = unavailableTimeListDay2.get(i);
            for (String time : day2UnavailableTimes) {
                System.out.print("\t"+ time);
            }
            
            System.out.println(); 
        }
    }


}

    
    
    

