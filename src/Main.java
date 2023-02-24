

public class Main {
    public static void main(String[] args) {
        Female_boobs girlfriend1 = new Female_boobs("Лида", 20, 3);
        Female_boobs girlfriend2 = new Female_boobs("Галя", 22, 4);
        Female_boobs girlfriend3 = new Female_boobs("Валя", 21, 5);
        Female_boobs girlfriend4 = new Female_boobs("Катя", 24, 2);
        Female_boobs girlfriend5 = new Female_boobs("Оля", 25, 5);

        My_personal_harem list_female = new My_personal_harem(girlfriend1);
        list_female.addfemale(girlfriend2);
        list_female.addfemale(girlfriend3);
        list_female.addfemale(girlfriend4);
        list_female.addfemale(girlfriend5);

        int max = 0;
        for (Female_boobs female: list_female
             ) {
            System.out.println(female);
            if(female.size()>max) max = female.size();
        }

        System.out.println("Самый большой размер - "+ max);

    }
}