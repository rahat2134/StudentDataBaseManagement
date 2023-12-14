

import java.util.HashMap;
import java.util.Scanner;



class Student{
    // we use public keyword here so that we can use outside this class/outside this class ;
    public String name;
    public int rollNo;
    public int age;
    public int Marks;


    public Student(String name, int rollNo, int age, int Marks){
        this.name=name;
        this.rollNo=rollNo;
        this.age=age;
        this.Marks=Marks;
    }

    // print the details;
    // void bcuz we only want to print and not return;
    public void viewStudent(){
        System.out.println("Name: "+name);
        System.out.println("RollNo: "+rollNo);
        System.out.println("Age: "+age);
        System.out.println("Marks: "+Marks);
        System.out.println("---------------------------------------");
    } 
}







public class StudentDataBaseManagement{
    public static void main(String[] args) {
        

        Scanner sc= new Scanner(System.in);

        
        HashMap<Integer,Student> database = new HashMap<Integer,Student>();

        while ((true)) {
          
            System.out.println("1.Add Student");
            System.out.println("2. view Student");
            System.out.println("3. search Student");
            System.out.println("4.Calculate Average marks");
            System.out.println("5. exit");

            System.out.println("Enter Your Choice:");
            int choice=sc.nextInt();
           sc.nextLine();
            

            switch(choice){
                case 1: System.out.print("Enter your name: ");
                        String name=sc.nextLine();
                        System.out.print("Enter your roll No: ");
                        int rollNo=sc.nextInt();
                       
                        System.out.print("Enter age: ");
                        int age=sc.nextInt();
                        System.out.print("Enter your marks: ");
                        int Marks=sc.nextInt();
                        if(Marks<0){
                            System.out.println("Marks cant be negative please fill it correctly");
                        }else{
                         

                        Student std = new Student(name, rollNo, age, Marks);

                        
                         database.put(rollNo, std);

                        System.out.println("Student added successfully");
                    
                        
                        break;
                        }

                        

               case 2:  System.out.println("List of Students: ");
                   
                        for(Student i:database.values()){
                            // call the method to print all values 
                            i.viewStudent();
                            
                        }
                        break;

            // here search 
            // give roll no for search;
            case 3: System.out.println("Enter Roll No-");
                    int roll= sc.nextInt();
                   database.get(roll).viewStudent();
                        break;

            case 4: System.out.println("Avereage Marks:");
                    int totalStudent=database.size();
                    int Totalmarks=0;
                    for(Student i:database.values()){
                        Totalmarks+=i.Marks;
                    }
                    System.out.println(Totalmarks/totalStudent);
                    break;

            case 5: System.exit(0);
            break;


                    }
                }
            }
        }       