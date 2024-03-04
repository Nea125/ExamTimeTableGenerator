
package Project;
import java.util.ArrayList;
import java.util.Scanner;
public class Subject {
    public String code;
    public String name;
    int n;
    static ArrayList<Subject> subjectlist = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public Subject() {
    }
    public Subject(String code, String name) {
        this.code = code;
        this.name = name;
    }
    void Header()
    {
        System.err.println("CODE\tNAME");
    }
    void Input()
    {

              System.out.print("Input Subject Code = "); code = sc.nextLine();
              System.out.print("Input Subject Name = "); name = sc.nextLine();
            
        
    }
    void Output()
    {
        for(int i=0;i<subjectlist.size();i++)
        {
            System.out.println(subjectlist.get(i).getCode()+"\t"+subjectlist.get(i).getName());
        
        }
    
    }
    int  Search(ArrayList<Subject> list)
    {
       
        int index = -1;
        String sname;
        System.out.print("Input Subject Name to Update : "); sname = sc.nextLine();
        for(int i=0;i<list.size();i++)
        {
            if(sname.equals(list.get(i).getName()))
            {
                index = i;
               
            
            }
         
        }
         return index;
    }
   
}
