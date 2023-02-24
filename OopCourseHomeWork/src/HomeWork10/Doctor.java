package HomeWork10;

public class Doctor {
    /*name
    age,job,gender,sal
    * */
    private String name;
    private  int age;
    private String job;
    private  int gender;
    private double sal;

    //构造器

    public Doctor(String name, int age, String job, int gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    public boolean equals(Object obj){
        if(this==obj){
            return  true;
        }
        if(obj instanceof Doctor){
            Doctor doctor =(Doctor) obj;
            return this.name.equals(doctor.name)&&this.age==doctor.age&&this.job.equals(doctor.job)&&this.gender==doctor.gender&&this.sal==doctor.sal;
        }else
            return false;
    }
}
