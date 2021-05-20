
public class ElementsExtends {

    public static void main(String[] args) {
        String[] seasons = new String[]{"Winter", "Spring", "Summer", "Autumn", "Зима"};
        seasons[0] = "Winter";
        seasons[1] = "Spring";
        seasons[2] = "Summer";
        seasons[3] = "Autumn";
        seasons[4] = "Зима";
        String y = seasons[0];
        seasons[0] = seasons[4];
        seasons[4] = y;

        int x = 0;
        while (x < 4) {
            System.out.println(seasons[x]);
            x = x + 1;

            System.out.println("Я изменила массив" + " " + seasons[0] + " "+ "на массив " + seasons[4]);


        }

    }
}

