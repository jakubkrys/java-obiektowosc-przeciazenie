public class StudentMAIN {

    public static void main(String[] args) {
        char[] adam = {'A','d','a','m'};
        char[] adamski = {'A','d','a','m','s','k','i'};
        char[] adamskiemail = {'a','a','d','a','m','s','k','i','@','g','m','a','i','l','.','c','o','m'};
        char[] bogdan = {'B','o','g','d','a','n'};
        char[] bogacki = {'B','o','g','a','c','k','i'};
        char[] dariusz = {'D','a','r','i','u','s','z'};
        char[] drewniak = {'D','r','e','w','n','i','a','k'};
        char[] drewniakemail = {'d','r','e','w','n','o','9','5','@','g','m','a','i','l','.','c','o','m'};
        char[] edmund = {'E','d','m','u','n','d'};
        char[] est = {'E','s','t'};
        char[] henryk = {'H','e','n','r','y','k'};
        char[] holecki = {'H','o','l','e','c','k','i'};

        Student s1 = new Student(adam, adamski, 28,adamskiemail, 124589);
        Student s2 = new Student(bogdan, bogacki);
        Student s3 = new Student(dariusz, drewniak, 19,drewniakemail, 124591);
        Student s4 = new Student(edmund, est);
        Student s5 = new Student(henryk, holecki);

        Student[] students = new Student[5];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        students[0].display(name, surname, age, email, index);
    }
}
