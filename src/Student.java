public class Student {
    char[] name;
    char[] surname;
    int age;
    char[] email;
    int index;

    Student (char[] name, char[] surname, int age, char[] email, int index){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.index = index;
    }

    Student (char[] name, char[] surname){
        this.name = name;
        this.surname = surname;
    }

    void display(char[] name, char[] surname, int age, char[] email, int index){
        System.out.print("Name: ");
        for (char n : name){
            System.out.print(n);
        }
        System.out.println();
        System.out.print("Surname: ");
        for (char s : surname){
            System.out.print(s);
        }
        System.out.println();
        System.out.println("Age: "+age);
        System.out.print("E-mail: ");
        for (char e : email){
            System.out.print(e);
        }
        System.out.println();
        System.out.println("Index: "+index);
        System.out.println();
    }
    void display(char[] name, char[] surname){
        System.out.print("Name: ");
        for (char n : name){
            System.out.print(n);
        }
        System.out.println();
        System.out.print("Surname: ");
        for (char s : surname){
            System.out.print(s);
        }
        System.out.println();
    }
}
