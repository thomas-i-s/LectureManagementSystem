package lecturemanagementsystem;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class Lecturer {
    private String name;
    private int age;
    private DateTime DOB;
    private int ID;
    private ArrayList<Module> modulesTeaching = new ArrayList<>();


    public Lecturer(String name, int age, DateTime DOB, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.DOB = DOB;
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

    public long getID() { 
        return ID; 
    }

    public String getUsername() {
        return this.name + this.age;
    }

    public ArrayList<Module> getModules() {
        return modulesTeaching;
    }

    public void addModules(Module module){
        this.modulesTeaching.add(module);
        module.setLecturer(this);
    }

    public DateTime getDOB() {
        return DOB;
    }

    public void setDOB(DateTime DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        String text = "";

        text += "ID: " + ID + "\n";
        text += "Name: " + name + "\n";
        text += "Age: " + age + "\n";
        text += "Date of Birth: " + DOB + "\n";

        String modules = "Modules Teaching: " + "\n";
        for(int i = 0; i < modulesTeaching.size(); i++)
        {
            modules += modulesTeaching.get(i) + "\n";
        }

        text += modules + "\n";

        return text;
    }
}
