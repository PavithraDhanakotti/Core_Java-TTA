package Core_Java.src_practice;

import java.util.*;

public class Lab0034 {
    public static void main(String[] args) {
        Students s1 =new Students(1,"Pavithra","hi@gmail.com",13456879);
        Students s2 = new Students(2,"Anand","Hi2@gmaile.com",741852963);
        Students s3 = new Students(3,"Dhanakotti","hi3@gmail.com",852963741);
        Students s4 = new Students(4,"Suguna","hi4@gmail.com",741852654);
        Students s5 = new Students(5,"Leela","hi5@gmail.com",963214569);

        List <Students> Stu1 = new ArrayList();
        Stu1.add(s1);
        Stu1.add(s2);
        Stu1.add(s3);

        List <Students> Stu2 = new ArrayList();
        Stu1.add(s4);
        Stu1.add(s5);

        Map <String,List <Students> > Automation = new TreeMap<>(); // Child Map
        Automation.put("AutomationBatch1",Stu1);
        Automation.put("AutomationBatch2",Stu2);


        Map <String,List <Students> > Manual = new TreeMap<>(); // Child Map
        Manual.put("ManualBatch1",Stu1);
        Manual.put("ManualBatch2",Stu2);

        Map<String, Map<String, List<Students>>> Courses = new HashMap<>(); // Parent
        Courses.put("Automation",Automation);
        Courses.put("Manual",Manual);

        Set< String> CoursesName = Courses.keySet();
        System.out.println(CoursesName);


        char ch = 'A';
        for (String cname: CoursesName){
            System.out.println(ch++ + ") Course" + cname);
            Map<String ,List<Students>> batchname = Courses.get(cname);
            Set<String> batchids = batchname.keySet();
            for (String batchid: batchids){
                List<Students > StuList = batchname.get(batchid);
                System.out.println();
                System.out.println("Students of "+ batchid + "Total : "+ StuList.size());
                System.out.println("=========================");
                int count = 1;
                for(Students mystu: StuList){
                    System.out.println(count++ + " - " + mystu);
                }
            }
        }
    }
}

class Students{

    private Integer Id;
    private String Name;
    private String Email;
    private long Phone_no;

    Students(){
        System.out.println("I am Default Constructor");
    }

    public Students(Integer id, String name, String email, long phone_no) {
        this.Id = id;
        Name = name;
        Email = email;
        Phone_no = phone_no;
    }

    @Override
    public String toString() {
        return "Students{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone_no=" + Phone_no +
                '}';
    }
}