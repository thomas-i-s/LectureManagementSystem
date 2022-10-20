package lecturemanagementsystem;

import java.util.ArrayList;
import org.joda.time.*;

public class Student {

    private String name;
    private int age;
    private DateTime DOB;
    private int ID;
    private ArrayList<CourseProgramme> coursesRegistered = new ArrayList<>();
    private ArrayList<Module> modulesRegistered = new ArrayList<>();

    public Student(String name, int age, DateTime DOB, int ID){
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.DOB = DOB;
    }

    public String getUsername(){
        return this.name + this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DateTime getDOB() {
        return DOB;
    }

    public void setDOB(DateTime DOB) {
        this.DOB = DOB;
    }

    public int getID() {
        return ID;
    }

    public ArrayList<CourseProgramme> getCourses() {
        return coursesRegistered;
    }
    public void addCourse(CourseProgramme course){
        this.coursesRegistered.add(course);
    }

    public ArrayList<Module> getModules() {
        return modulesRegistered;
    }
    public void addModule(Module module){
        this.modulesRegistered.add(module);
    }

    @Override
    public String toString() {
        String text = "";

        text += "ID: " + this.ID + "\n";
        text += "Username: " + this.getUsername();
        text += "Name: " + this.name + "\n";
        text += "Age: " + this.age + "\n";
        text += "Date of Birth: " + this.DOB + "\n";

        String courses = "Courses Registered: \n";
        String modules = "Modules Registered: \n";

        for(int i = 0; i < coursesRegistered.size(); i++)
        {
            courses += coursesRegistered.get(i) + "\n";
        }
        for(int i = 0; i < modulesRegistered.size(); i++)
        {
            modules += modulesRegistered.get(i) + "\n";
        }
        
        text += courses + "\n";
        text += modules + "\n";

        return text;
    }
}