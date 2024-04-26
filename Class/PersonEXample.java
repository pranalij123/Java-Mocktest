public class PersonEXample {
    public static void main(String[] args) {
        Person p= new Person();
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.bloodGroup);
        System.out.println(p.gender);
        System.out.println("********************");

        p.name="Neha";
        p.age=18;
        p.bloodGroup='A';
        p.gender="Female";
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.bloodGroup);
        System.out.println(p.gender);
        System.out.println("********************");
        Person r= new Person();
        r.name="Prajwal";
        r.age=10;
        r.bloodGroup='o';
        r.gender="male";
        System.out.println(r.name);
        System.out.println(r.age);
        System.out.println(r.bloodGroup);
        System.out.println(r.gender);
    }
}
class Person{
    String name;
    int age;
    char bloodGroup;
    String gender;
}
/*
output:
 null
0

null
********************
Neha
18
A
Female
********************
Prajwal
10
o
male
 */
