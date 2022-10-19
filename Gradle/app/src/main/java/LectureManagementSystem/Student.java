package LectureManagementSystem;

import java.util.Date;
//import org.joda.time.*;

public class Student {
    
    private String name;
    private int age;
    private Date DOB;
    private int ID;
    private String[] courses;
    private String[] modules;

    public Student(String name, int age, Date DOB, int ID, String[] courses, String[] modules)
    {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
        this.courses = courses;
        this.modules = modules;
    }

    public String getUsername()
    {
        return name + age;
    }

    //setter and getter for name
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }


    //setter and getter for age
    public void setAge(int age)
    {
        this.age = age;    
    }

    public int getAge()
    {
        return age;
    }

    //setter and getter for DOB
    public void setDOB(Date DOB)
    {
        this.DOB = DOB;
    }

    public Date getDOB()
    {
        return DOB;
    }

    //setter and getter for ID
    public void setID(int ID)
    {
        this.ID = ID;
    }

    public int getID()
    {
        return ID;
    }

    //setter and getter for courses
    public void setCourses(String[] courses)
    {
        this.courses = courses;
    }

    public String[] getCourses()
    {
        return courses;
    }

    //setter and getter for modules
    public void setModules(String[] modules)
    {
        this.modules = modules;
    }

    public String[] getModules()
    {
        return modules;
    }

}
