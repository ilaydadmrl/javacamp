package Task2;

public class Main {
    public static void main(String[] args){
        Course course1 = new Course("Java + React", "Engin Demiroğ");
        Course course2 = new Course("C# + Angular", "Engin Demiroğ");
        Course course3 = new Course("Programlamaya Giriş", "Engin Demiroğ");
        Course[] courses = {
                course1,
                course2,
                course3
        };

        for(Course course : courses){
            System.out.println("Kurs Adı: " + course.name + "\nEğitmen Adı: " + course.instructor + "\n*********");
        }

        CourseManager courseManager = new CourseManager();
        courseManager.add(course1);
        courseManager.delete(course3);

    }
}
