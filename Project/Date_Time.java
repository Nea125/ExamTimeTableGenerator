
package Project;
import java.util.ArrayList;
import java.util.Scanner;
public class Date_Time {
    public int dayofexam;
    public String examdate;
    public String examtime;
    Scanner sc = new Scanner(System.in);
    static ArrayList<Date_Time> examdatelist = new ArrayList<>();
    static ArrayList<Date_Time> examtimelist = new ArrayList<>();
    public int getDayofexam() {
        return dayofexam;
    }
    public String getExamdate() {
        return examdate;
    }
    public String getExamtime() {
        return examtime;
    }
    public Date_Time() {
    }
    public Date_Time(int dayofexam, String examdate, String examtime) {
        this.dayofexam = dayofexam;
        this.examdate = examdate;
        this.examtime = examtime;
    }
    void Inputdate()
    {
      
      
            System.out.print("Input Exam Date :");examdate = sc.nextLine();
    
    }
    
    void Inputtime()
    {
        
            System.out.print("Input ExamTime : "); examtime = sc.nextLine();
    
    }
    int Search(ArrayList<Date_Time> list)
    {
        int index = -1;
        String stime;
        System.out.print("Input Subject Time to Update : "); stime = sc.nextLine();
        for(int i=0;i<list.size();i++)
        {
            if(stime.equals(list.get(i).getExamtime()))
            {
                index = i;
               
            
            }
         
        }
         return index;

    }
  
    
}
