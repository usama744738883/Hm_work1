public class Main {
    public static void main(String[] args) {
        Student student = new Student("MGU","Faculty of Biology");
        Mother mother = new Mother(44,"Marry", student, Job.NURSE);
        System.out.println(mother.getInfo());
        mother.scoresORT();
        mother.scoresORT(String.valueOf(120));
        System.out.println("-------------------------------------");
        Student student1=new Student("Geektech","IT");
        Daughter daughter=new Daughter(20,"Elizabeth", student1,Job.SCHOOLGIRL,"music");
        System.out.println(daughter.getInfo());
        daughter.scoresORT();
        daughter.scoresORT(String.valueOf(150));
        System.out.println("--------------------------------");
        Student student2 = new Student("Stanford","Lawyer");
        Daughter daughter1=new Daughter(26,"Bella",student2,Job.SCHOOLGIRL,"draw");
        System.out.println(daughter1.getInfo());
        daughter1.scoresORT();
        daughter1.scoresORT(String.valueOf(145));

    }
}