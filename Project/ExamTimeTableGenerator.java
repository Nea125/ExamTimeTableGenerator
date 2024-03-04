
package Project;
import java.util.ArrayList;
import java.util.List;
public class ExamTimeTableGenerator {
    Subject subject = new Subject();
    Student student = new Student();
    Date_Time datetime = new Date_Time();
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String BOLD = " \\u001B[1m";
    String day[]={"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FIRDAY","SARTUDAY","SUNDAY"};
    void date()
    {
         System.err.println( CYAN + "\t EXAM SESSION  " + Date_Time.examdatelist.get(0).getExamdate());
    
    }
    public void Header()
    {
        System.out.print(GREEN+"TIME\t\t\t");
        for(int i=0;i<Date_Time.examdatelist.size();i++)
        {
             System.out.print(day[i]+"\t\t\t");
        }
        System.out.println("");

    }
    public void generatTimeTable() {
        int j = 4;
        int k = 8;
           
            for (int i = 0; i < Date_Time.examtimelist.size(); i++) {
               
                System.out.print(Date_Time.examtimelist.get(i).examtime + "\t\t");

            
                if (i < Subject.subjectlist.size()) {
                    System.out.print(Subject.subjectlist.get(i).getName());
                }

              
                if (j + i < Subject.subjectlist.size()) {
                    System.out.print("\t\t" + Subject.subjectlist.get(j + i).getName());
                }
             
                if (i + k < Subject.subjectlist.size()) {
                    System.out.print("\t\t" + Subject.subjectlist.get(i + k).getName());
                }

             
                System.out.println();
         }
      
        
}

    public void updateExamTimeTable() {
        List<String> rescheduledStudents = new ArrayList<>();
        List<List<String>> rescheduledTimes = new ArrayList<>();

       
        for (int i = 0; i < Student.studentlist.size(); i++) {
            Student student = Student.studentlist.get(i);
            List<String> day1UnavailableTimes = Student.unavailableTimeListDay1.get(i);
            List<String> day2UnavailableTimes = Student.unavailableTimeListDay2.get(i);

           
            if (day1UnavailableTimes.size() > 0 && day2UnavailableTimes.size() == 0) {
               
                Student.unavailableTimeListDay1.set(i, new ArrayList<>());
                Student.unavailableTimeListDay2.set(i, day1UnavailableTimes);
                rescheduledStudents.add(student.getName());
                rescheduledTimes.add(day1UnavailableTimes);
            }
            else if (day1UnavailableTimes.size() > 0 && day2UnavailableTimes.size() > 0) {
                List<String> allUnavailableTimes = new ArrayList<>();
                allUnavailableTimes.addAll(day1UnavailableTimes);
                allUnavailableTimes.addAll(day2UnavailableTimes);
                rescheduledStudents.add(student.getName());
                rescheduledTimes.add(allUnavailableTimes);
            }
             else if (day1UnavailableTimes.size() == 0 && day2UnavailableTimes.size() > 0) {
                List<String> allUnavailableTimes = new ArrayList<>();
                allUnavailableTimes.addAll(day1UnavailableTimes);
                allUnavailableTimes.addAll(day2UnavailableTimes);
                rescheduledStudents.add(student.getName());
                rescheduledTimes.add(allUnavailableTimes);
            }
        }
        System.out.println("Rescheduled Students for WEDNESDAY :");
        for (int i = 0; i < rescheduledStudents.size(); i++) {
            System.out.println("Student Name: " + rescheduledStudents.get(i));
            System.out.print("ExamTime Times:");
            for (String time : rescheduledTimes.get(i)) {
                System.out.print("\t" + time);
            }
            System.out.println();
        }
    }

    
                  
}     
            
            

    

    

