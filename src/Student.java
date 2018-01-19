import java.util.concurrent.ThreadLocalRandom;

public class Student {
    private String name;
    private int age;


    public Student() {
        setName();
        setAge();
    }


    public String getName() {
        return name;
    }


    public void setName() {
        String [] str = new String [20];
        str[0] = "Nikolay";
        str[1] = "Petia";
        str[2] = "Tolik";
        str[3] = "Elmadin";
        str[4] = "Evgeniy";
        str[5] = "Vova";
        str[6] = "Anton";
        str[7] = "Sergey";
        str[8] = "Gora";
        str[9] = "Kirill";
        str[10] = "Ksenia";
        str[11] = "Marina";
        str[12] = "Vasilisa";
        str[13] = "Stepanida";
        str[14] = "Polina";
        str[15] = "Katerina";
        str[16] = "Valeria";
        str[17] = "Cleopatra";
        str[18] = "Pelagea";
        str[19] = "Elvira";
        this.name = str[ThreadLocalRandom.current().nextInt(0, 19 + 1) ];
    }


    public void setAge() {
        int randomNum = ThreadLocalRandom.current().nextInt(7, 16 + 1);
        this.age = randomNum;
    }

    public int getAge() {
        return age;
    }



}
