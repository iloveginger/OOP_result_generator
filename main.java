import Models.Student;
public class Main {
    public static void main(String[] args) {
        int[] std1 = {88,90,93,98,95};
        int[] std2 = {98,96,94,92,90};
        int[] std3 = {70,68,66,50,44};
        Student student1 = new Student("Shreyansh Pokharel",18,std1,12);

        Student student2 = new Student("Ram Poudel",17,std2,11);

        Student student3 = new Student("Hari Prasad Pandey",18,std3,12);





        student2.display_result();
        student1.display_result();
        student3.display_result();
    }
}
