package class14;

public class Student implements Comparable<Student>{

    @Override
    public int compareTo(Student o) {
//       return  this.name.compareTo(o.name);
         int compareName = this.name.compareTo(o.name);
         if(compareName==0){
             return this.age.compareTo(o.getAge());
         }
         return compareName;
    }

    private Long id;
    private String name;
    private Double age;
    public Student( String name, Double age) {
//        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {

    }
    public Double getAge() {
        return age;
    }
    public void setAge(Double age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [ name=" + name + ", age=" + age + "]";
    }
}
