package lecturemanagementsystem;

import java.util.ArrayList;

public class Module {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<CourseProgramme> coursesAssociated = new ArrayList<>();
    private Lecturer lecturer;

    public Module(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student){
        this.students.add(student);
        if (!student.getModules().contains(this)){
            student.addModule(this);
        }
    }

    public ArrayList<CourseProgramme> getAssociatedCourses() {
        return coursesAssociated;
    }

    public void addAssociatedCourse(CourseProgramme course){
        this.coursesAssociated.add(course);
        if (!course.getModules().contains(this)){
            course.addModule(this);
        }
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    @Override
    public String toString() {
        String text = "";

        text += name + "\n";
        
        String studentsRegistered = "Students Registered: \n";
        for(int i = 0; i < students.size(); i++)
        {
            studentsRegistered += students.get(i) + "\n";
        }

        text += studentsRegistered + "\n";

        String courses = "Courses Associated";
        for(int i = 0; i < coursesAssociated.size(); i++)
        {
            courses += coursesAssociated.get(i) + "\n";
        }

        text += courses + "\n";
        
        text += lecturer + "\n";

        return text;
    }
}
