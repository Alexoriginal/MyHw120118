import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student [] studArr= new Student[40];//создаем массив студентов 40 шт
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < 40; i++) {
            Student stud = new Student();//студента
            studArr[i] = stud;
            if (stud.getAge() <12 ) {
                countA ++;
            }
            else {
                countB ++;
            }
        }
        int n = 0;
        if (countA < 12) {
            n = countA;
        }
        else {
            n = 12;
        }
        int n1 = 0;
        Student [] stA = new Student[n];
        for (int i = 0; i < n; i++){
            for (int j = n1; j < studArr.length; j++){
                if (studArr[j].getAge() < 12) {
                    stA[i] = studArr[j];
                    n1 = j + 1;
                    break;
                }
            }
        }
        ClassRoom clA = new ClassRoom("A",12,stA);

        int k = 0;
        if (countB < 15) {
            k = countB;
        }
        else {
            k = 15;
        }
        Student [] stB = new Student[k];
        int k1 = 0;
        for (int i = 0; i < k; i++){
            for (int j = k1; j < studArr.length; j++){
                if (studArr[j].getAge() >= 12) {
                    stB[i] = studArr[j];
                    k1 = j + 1;
                    break;
                }
            }
        }
        ClassRoom clB = new ClassRoom("B",15,stB);

        System.out.println("----------ВСЕ----------");
        for (Student student : studArr) {
            System.out.println(student.getName() +" "+ student.getAge());
        }

        System.out.println("----------A----------");
        for (Student student : stA) {
            System.out.println(student.getName() +" "+ student.getAge());
        }

        System.out.println("----------B----------");
        for (Student student : stB) {
            System.out.println(student.getName() +" "+ student.getAge());
        }

        int countNEnA = 0;
        System.out.println("-------НЕДОСТАТОЧНО в А---------");
        for (int j = n1; j < studArr.length; j++){
            if (studArr[j].getAge() < 12) {
                System.out.println(studArr[j].getName() +" "+ studArr[j].getAge());
                countNEnA ++;
            }
        }
        System.out.println("НЕ В А: " + countNEnA);

        int countNEnB = 0;
        System.out.println("-------НЕДОСТАТОЧНО в B---------");
        for (int j = k1; j < studArr.length; j++){
            if (studArr[j].getAge() >= 12) {
                System.out.println(studArr[j].getName() +" "+ studArr[j].getAge());
                countNEnB ++;
            }
        }
        System.out.println("НЕ В B: " + countNEnB);

        boolean fl = true;
        while (fl) {
            System.out.println("Выбери метод");
            System.out.println("1. Количество студентов в классах");
            System.out.println("2. Список студентов в классах");
            System.out.println("3. Короткий список студентов в классах");
            System.out.println("4. Сортировка списка учащихся по возрастанию в классах");
            System.out.println("5. Сортировка списка учащихся по убыванию в классах");
            System.out.println("6. Сортировка списка учеников по  возрастанию имени в классах");
            System.out.println("7. Сортировка списка учеников по убыванию имени в классах");
            System.out.println("8. Поиск ученика по имени");
            System.out.println("9. Найти класс по имени ученика");

            Scanner in = new Scanner(System.in);
            int ans = in.nextInt();

            switch (ans) {
                case 1: {
                    System.out.println("--------------------");
                    System.out.println("----------A----------");
                    System.out.println("Колличество студентов в А классе " + clA.getClassCount());
                    System.out.println("----------B----------");
                    System.out.println("Колличество студентов в В классе " + clB.getClassCount());
                    break;
                }
                case 2: {
                    System.out.println("--------------------");
                    System.out.println("----------A----------");
                    System.out.println("Список студентов в А : ");
                    clA.getClassList();
                    System.out.println("----------B----------");
                    System.out.println("Список студентов в В: ");
                    clB.getClassList();
                    break;
                }
                case 3: {
                    System.out.println("--------------------");
                    System.out.println("----------A----------");
                    System.out.println("Список студентов в А: ");
                    clA.getShortClassList();
                    System.out.println("----------B----------");
                    System.out.println("Список студентов в В: ");
                    clB.getShortClassList();
                    break;
                }
                case 4: {
                    System.out.println("--------------------");
                    System.out.println("----------A----------");
                    System.out.println("Сортировка списка учащихся по возрастанию в классах: ");
                    clA.ageSort();
                    clA.getClassList();
                    System.out.println("----------B----------");
                    System.out.println("Сортировка списка учащихся по возрастанию в классах: ");
                    clB.ageSort();
                    clB.getClassList();
                    break;
                }
                case 5: {
                    System.out.println("--------------------");
                    System.out.println("----------A----------");
                    System.out.println("Сортировка списка учащихся по возрастанию в классах: ");
                    clA.ageRevSort();
                    clA.getClassList();
                    System.out.println("----------B----------");
                    System.out.println("Сортировка списка учащихся по возрастанию в классах: ");
                    clB.ageRevSort();
                    clB.getClassList();
                    break;
                }

                case 6: {
                    System.out.println("--------------------");
                    System.out.println("----------A----------");
                    System.out.println("Список отсортированных имен студентов в классе A: ");
                    clA.nameSort();
                    clA.getClassList();
                    System.out.println("----------B----------");
                    System.out.println("Список отсортированных имен студентов в классе B: ");
                    clB.nameSort();
                    clB.getClassList();
                    break;
                }

                case 7: {
                    System.out.println("--------------------");
                    System.out.println("----------A----------");
                    System.out.println("Обратный cписок отсортированных имен студентов в классе B: ");
                    clA.nameRevSort();
                    clA.getClassList();
                    System.out.println("----------B----------");
                    System.out.println("Обратный список отсортированных имен студентов в классе B: ");
                    clB.nameRevSort();
                    clB.getClassList();
                    break;
                }
                case 8:{
                    System.out.println("Наберите имя студента!!!:");
                    Scanner inN = new Scanner(System.in);
                    String fName = inN.nextLine();
                    System.out.println("----------A----------");
                    System.out.println("Студент в А классе с именем  " + fName + ":");
                    clA.findStudent(fName);
                    System.out.println("----------B----------");
                    System.out.println("Студент в В классе с именем  " + fName + ":");
                    clB.findStudent(fName);
                    break;
                }

                case 9:{
                    System.out.println("Наберите имя студента!!!:");
                    Scanner inN = new Scanner(System.in);
                    String fName = inN.nextLine();
                    System.out.println("----------A----------");
                    System.out.println("Студент по имени " + fName +" в классе " +  clA.findClass(fName));
                    System.out.println("----------B----------");
                    System.out.println("Студент по имени " + fName + " в классе  " +  clB.findClass(fName));
                    break;
                }

                default:{
                    fl = false;
                    System.out.println("ПОКА!!!");
                    break;
                }
            }
        }




    }
}
