public class Mother extends GrandMother{
    private  int age;
    private String name;

    public Mother(int age, String name,Student student, Job job) {
        this.age = age;
        this.name = name;
    super.setJob(job);
    super.setStudent(student);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public String getInfo(){
        return  "Age"+ getAge() +
                "\nName:"+getName()+
                "\nUniversity:"+ getStudent().getUniversity()+
                "\nFaculty of:"+ getStudent().getFaculty()+
                "\nJob:"+this.getJob();



    }
    public static void scoresORT(){
        System.out.println("Проходной балл ORT: 120");
    }
    public static int scoresORT(String scoresORT){
        System.out.println("Получил:"+scoresORT );
        return 0;
    }
}
