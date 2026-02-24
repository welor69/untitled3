public class Main{
    public static void main(String[] args){
        Course first = new Course("Programming language","Miss Azhar",6);
        Course second = new Course("Discrete Mathematics", "Mister Matanov", 6);
        AssignmentTask numberOne = new AssignmentTask("OOP",first,48,3);
        AssignmentTask numberTwo = new AssignmentTask("OOP",first,5,0);
        AssignmentTask numberTree = new AssignmentTask("Proof methods",second,12,2);
        AssignmentTask numberFour = new AssignmentTask("Homework",second,6,6);
        
        
        StudySession Sc = new StudySession(first,90);
        StudySession Sc1 = new StudySession(first,90);
        StudySession Sc2 = new StudySession(second,90);
        System.out.println(first);
        System.out.println(second);
        System.out.println(numberOne.getEstimatedHours());
         System.out.println(numberTwo.getEstimatedHours());
         System.out.println(numberTree.getEstimatedHours());
         System.out.println(numberFour.getEstimatedHours());
        
        
    
    }
}

class Course{
    private String name, instructor;
    private int credits;
    Course(String name, String instructor, int credits){
        this.name = name;
        this.instructor = instructor;
        this.credits = credits;

    }
    public String getName(){
        return name;
    }
    public String getInstructor(){
        return instructor;
    }
    public int getCredits(){
        return credits;
    }
    public String toString(){
        return "Course{name = " + name + ", instructor = " + instructor + ", credits = " + credits + "}";

    }
}
class AssignmentTask{
    private String title;
    private Course course;
    private int estimatedHours;
    private int daysUntilDue;
    private boolean completed = false;
    AssignmentTask(String title, Course course, int estimatedHours, int daysUntilDue){
        this.title = title;
        this.course = course;
        this.estimatedHours = estimatedHours;
        this.daysUntilDue = daysUntilDue;
    }
    public String getTitle(){
        return title;
    }
    public Course getCourse(){
        return course;
    }
    public int getEstimatedHours(){
        return estimatedHours;
    }
    public int getDaysUntilDue(){
        return daysUntilDue;
    }
    public void MarkCompleted(){
        completed = true;
    }
    public boolean isUrgent(){
        boolean answer = false;
        if (daysUntilDue < 2) answer = true;
        return answer;
    }
    public String toString(){
        return "AssignmentTask{title="+ title + ", course=" + course + ", estHours=" + estimatedHours + ", dueIn=" + daysUntilDue +
                ", completed=" + completed +"}";
    }
}
class StudySession{
        private Course course;
        private int minutes;
        StudySession(Course course, int minutes){
                this.course = course;
                this.minutes = minutes;
            }
        public Course getCourse(){
            return course;
        }
        public int getMinutes(){
            return minutes;
        }
        public double hours(){
            double h = minutes/60.0;
            return h;
        }
        public String toString(){
                return "StudySession{course = " + course.getName() + ", minutes = " + minutes + "}";
            }
    }