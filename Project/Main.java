
package Project;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int i,j,op,n;
        Scanner sc = new Scanner(System.in);
        Subject subject = new Subject();
        Student student = new Student();
        Date_Time datetime = new Date_Time();
        ExamTimeTableGenerator examtimetable = new ExamTimeTableGenerator();
        do{
            
                System.out.println("\n=========>> OPTION <<=========");
                System.out.println("[1] ---> InputData");
                System.out.println("[2] ---> GenderatExamTimeTable");
                System.out.println("[3] ---> Update");
                System.out.println("[4] ---> Exit Program");
                System.out.print("Please Choose Option = "); op = sc.nextInt();
                switch(op)
                {
                    case 1->{
                        int op1;
                         do{
                             
                                System.out.println("\n=========>> OPTION <<=========");
                                System.out.println("[1] ---> Input Subject");
                                System.out.println("[2] ---> Input Date");
                                System.out.println("[3] ---> Input Time");
                                System.out.println("[4] ---> Input Student");
                                System.out.println("[5] ---> Back");
                                System.out.print("Please Choose Option = "); op1 = sc.nextInt();
                                switch(op1)
                                {
                                    case 1->{
                                         System.out.print("Input Number Of Subject = "); n = sc.nextInt(); sc.nextLine();
                                        for(i=0;i<n;i++)
                                        {
                                             subject = new Subject();
                                             System.err.println("\t\tSubject["+(i+1)+"]");
                                             subject.Input();
                                             Subject.subjectlist.add(subject);
                                        }
                                            
                                    }
                                    case 2->{
                                           System.out.print("Input Day Of Exam = "); int dayofexam = sc.nextInt(); sc.nextLine();
                                            for( i = 0;i<dayofexam;i++)
                                            {
                                                datetime = new Date_Time();
                                                datetime.Inputdate();
                                                Date_Time.examdatelist.add(datetime);
                                                
                                            }
                                            
                                    
                                    
                                    }
                                    case 3->{
                                        
                                            for(i=0;i<4;i++)
                                            {
                                                datetime = new Date_Time();
                                                datetime.Inputtime();
                                                Date_Time.examtimelist.add(datetime);
                                            }
                                            
                                    }
                                    case 4->{
                                            
                                        student.Input();  
                                    }
                                    case 5->{
                                        
                                        System.err.println("\tBACK TO MAIN OPTOIN");
                                    }
                                    default -> System.out.println("No Option.......");
                                   
                                }
                         
                         }while(op1!=5);
                    }
                    case 2->{
                        
                        if(Student.studentlist.size()==0 || Subject.subjectlist.size()==0 || Date_Time.examdatelist.size()==0 || Date_Time.examtimelist.size()==0)
                        {
                            System.err.println("\t Please Input Data.....!!");
                        }
                        else
                        {
                            examtimetable.date();
                            examtimetable.Header();
                            examtimetable.generatTimeTable();
                            
                        }
                          
                    }
                    case 3->{
                        

                         int op1;
                         do{
                             
                                System.out.println("\n=========>> UPDATE OPTION <<=========");
                                
                                System.out.println("[1] ---> Time");
                                System.out.println("[2] ---> Subject");
                                System.out.println("[3] ---> ReExam");
                                System.out.println("[4] ---> Back");
                                System.out.print("Please Choose Option = "); op1 = sc.nextInt();
                                switch(op1)
                                {
                                    case 1->{
                                        
                                           int index = datetime.Search(Date_Time.examtimelist);
                                           if(index == -1)
                                           {
                                               System.out.println("\t Search Not Found...");
                                           
                                           }
                                           else{
                                               datetime = new Date_Time();
                                               datetime.Inputtime();
                                               Date_Time.examtimelist.set(index, datetime);
                                               System.out.println("\t Update Sucess.....");
                                           
                                           }
                                            
                                    }
                                    case 2->{
                                         int index = subject.Search(Subject.subjectlist);
                                           if(index == -1)
                                           {
                                               System.out.println("\t Search Not Found...");
                                           
                                           }
                                           else{
                                               subject = new Subject();
                                               subject.Input();
                                               Subject.subjectlist.set(index, subject);
                                               System.out.println("\t Update Sucess.....");
                                           
                                           }
                                           
                                            
                                    }
                                    case 3->{
                                         examtimetable.updateExamTimeTable();
                                            
                                       
                                    }
                                    case 4->{
                                       
                                        System.err.println("\tBACK TO MAIN OPTOIN");
                                        
                                    }
                                   
                                    default -> System.out.println("No Option.......");
                                   
                                }
                         
                         }while(op1!=4);
                    }
                        
                      case 4->{ 
                       System.exit(0);
                    }    
                    default ->  System.err.println("Invalid option. Please choose a valid option.");
                }
        }while(op!=0);    
    }
}
