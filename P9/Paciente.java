public class Paciente {
    private int age;
    private int anaemia;
    private int creatininePhosphokinase;
    private int diabetes;
    private int ejectionFraction;
    private int highBloodPressure;
    private double platelets; 
    private double serumCreatinine;
    private int serumSodium;
    private int sex;
    private int smoking;
    private int time;
    private int deathEvent;

    
    public Paciente(int age, int anaemia, int creatininePhosphokinase, int diabetes, int ejectionFraction,
                    int highBloodPressure, double platelets, double serumCreatinine, int serumSodium,
                    int sex, int smoking, int time, int deathEvent) {
        this.age = age;
        this.anaemia = anaemia;
        this.creatininePhosphokinase = creatininePhosphokinase;
        this.diabetes = diabetes;
        this.ejectionFraction = ejectionFraction;
        this.highBloodPressure = highBloodPressure;
        this.platelets = platelets;
        this.serumCreatinine = serumCreatinine;
        this.serumSodium = serumSodium;
        this.sex = sex;
        this.smoking = smoking;
        this.time = time;
        this.deathEvent = deathEvent;
    }


    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public int getAnaemia() { return anaemia; }
    public void setAnaemia(int anaemia) { this.anaemia = anaemia; }

    public int getCreatininePhosphokinase() { return creatininePhosphokinase; }
    public void setCreatininePhosphokinase(int creatininePhosphokinase) { this.creatininePhosphokinase = creatininePhosphokinase; }

    public int getDiabetes() { return diabetes; }
    public void setDiabetes(int diabetes) { this.diabetes = diabetes; }

    public int getEjectionFraction() { return ejectionFraction; }
    public void setEjectionFraction(int ejectionFraction) { this.ejectionFraction = ejectionFraction; }

    public int getHighBloodPressure() { return highBloodPressure; }
    public void setHighBloodPressure(int highBloodPressure) { this.highBloodPressure = highBloodPressure; }

    public double getPlatelets() { return platelets; }
    public void setPlatelets(double platelets) { this.platelets = platelets; }

    public double getSerumCreatinine() { return serumCreatinine; }
    public void setSerumCreatinine(double serumCreatinine) { this.serumCreatinine = serumCreatinine; }

    public int getSerumSodium() { return serumSodium; }
    public void setSerumSodium(int serumSodium) { this.serumSodium = serumSodium; }

    public int getSex() { return sex; }
    public void setSex(int sex) { this.sex = sex; }

    public int getSmoking() { return smoking; }
    public void setSmoking(int smoking) { this.smoking = smoking; }

    public int getTime() { return time; }
    public void setTime(int time) { this.time = time; }

    public int getDeathEvent() { return deathEvent; }
    public void setDeathEvent(int deathEvent) { this.deathEvent = deathEvent; }

   
    @Override
    public String toString() {
        return "Paciente [Edad=" + age + ", Anemia=" + anaemia + ", CPK=" + creatininePhosphokinase +
                ", Diabetes=" + diabetes + ", Ejection Fraction=" + ejectionFraction + ", Presión Alta=" + highBloodPressure +
                ", Plaquetas=" + platelets + ", Creatinina Suero=" + serumCreatinine + ", Sodio Suero=" + serumSodium +
                ", Sexo=" + sex + ", Fumador=" + smoking + ", Tiempo=" + time + ", Evento Muerte=" + deathEvent + "]";
    }
}
