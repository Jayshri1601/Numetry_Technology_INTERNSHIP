//2.Array.toString() method

class Demo {
    public static void main(String[] args) {
        Student[] students = {new Student("Jayshri"), new Student("Snehal")};
        
        System.out.println(Arrays.toString(students));
        
    }
}

class Student {
    private String name;

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + '}';
    }
}