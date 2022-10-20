package lecturemanagementsystem;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class CourseProgramme {
    
    private String name;
    private ArrayList<Module> moduleList = new ArrayList<>();
    private ArrayList<Student> studentsEnrolled = new ArrayList<>();
    private DateTime startDate;
    private DateTime endDate;
    

    public CourseProgramme(String name, DateTime startDate, DateTime endDate){
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getModules() {
        return moduleList;
    }

    public void addModule(Module module) {
        this.moduleList.add(module);
    }

    public ArrayList<Student> getStudents() {
        return studentsEnrolled;
    }

    public void addStudent(Student student){
        this.studentsEnrolled.add(student);
        student.addCourse(this);
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        String text = "";

        text += "Course Code: " + this.name + "\n";
        
        String modules = "Modules: \n";

        for(int i = 0; i < moduleList.size(); i++)
        {
            modules += moduleList.get(i) + "\n";
        }

        text += modules;

        String students = "Students Enrolled \n";

        for(int i = 0; i < studentsEnrolled.size(); i++)
        {
            students += studentsEnrolled.get(i) + "\n";
        }

        text += students;

        text += "Start Date: " + this.startDate + "\n";
        text += "End Date: " + this.endDate + "\n";

        return text;
    }
}