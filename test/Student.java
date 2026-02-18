package test;
class Student {

    String name;
    int marks;
    static String collegeName = "LPU";
    static final int MAX_MARKS = 100;

    Student(String name, int marksObtained) {
        this.name = name;
        this.marks = marksObtained;
    }

    public void printPercentage() {
        double percentage = (marks / (double) MAX_MARKS) * 100;
        System.out.printf("Percntg : %.2f%%\n", percentage);
    }
}

 class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 87);
        Student s2 = new Student("Ananya", 92);

        System.out.println("Name: " + s1.name);
        System.out.println("College: " + Student.collegeName);
        System.out.println("mark: " + s1.marks);
        s1.printPercentage();

        System.out.println();

        System.out.println("name: " + s2.name);
        System.out.println("college: " + Student.collegeName);
        System.out.println("Marks: " + s2.marks);
        s2.printPercentage();
    }
}
