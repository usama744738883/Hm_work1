public final class Daughter extends  Mother{
    private String hobby;
    public Daughter(int age, String name, Student student, Job job,String hobby) {
        super(age, name, student, job);
        this.hobby=hobby;



    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\nHobby:" +hobby;
    }
}
