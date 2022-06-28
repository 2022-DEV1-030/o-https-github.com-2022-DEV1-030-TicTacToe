import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Bnp {

    public static void main(String[] args) {

        Map<Integer, Person> tocs = new HashMap<>();

        String[] colorArray = new String[]{"bleu", "red"};

        String[] personName = new String[]{"person1", "person2"};

        Random rand = new Random();

        int exitValue;
        boolean finish = Boolean.FALSE;
        int full = 9;
        int countRow = 0;

        while (!finish) {
            exitValue = rand.nextInt(9);

            if (!tocs.containsKey(exitValue)) {
                Person p = new Person();
                p.setExitColor(colorArray[countRow % 2]);
                p.setPersonName(personName[countRow % 2]);
                tocs.put(exitValue, p);
                --full;
                ++countRow;
            } else
                continue;

            if (full == 0)
                finish = Boolean.TRUE;
        }

        if ((tocs.get(0).getExitColor().equalsIgnoreCase(tocs.get(1).getExitColor()) && tocs.get(1).getExitColor().equalsIgnoreCase(tocs.get(2).getExitColor()))
                || (tocs.get(0).getExitColor().equalsIgnoreCase(tocs.get(3).getExitColor()) && tocs.get(3).getExitColor().equalsIgnoreCase(tocs.get(6).getExitColor()))
                 || (tocs.get(0).getExitColor().equalsIgnoreCase(tocs.get(4).getExitColor()) && tocs.get(4).getExitColor().equalsIgnoreCase(tocs.get(8).getExitColor()))) {
            Person winner = tocs.get(0);
            System.out.println("The winner is " + winner.getPersonName());

        } else if ((tocs.get(3).getExitColor().equalsIgnoreCase(tocs.get(4).getExitColor()) && tocs.get(4).getExitColor().equalsIgnoreCase(tocs.get(5).getExitColor()))
                || (tocs.get(1).getExitColor().equalsIgnoreCase(tocs.get(4).getExitColor()) && tocs.get(4).getExitColor().equalsIgnoreCase(tocs.get(7).getExitColor()))
                 || (tocs.get(2).getExitColor().equalsIgnoreCase(tocs.get(4).getExitColor()) && tocs.get(4).getExitColor().equalsIgnoreCase(tocs.get(6).getExitColor()))) {
            Person winner = tocs.get(4);
            System.out.println("The winner is " + winner.getPersonName());

        } else if ((tocs.get(6).getExitColor().equalsIgnoreCase(tocs.get(7).getExitColor()) && tocs.get(7).getExitColor().equalsIgnoreCase(tocs.get(8).getExitColor()))
                || (tocs.get(2).getExitColor().equalsIgnoreCase(tocs.get(5).getExitColor()) && tocs.get(5).getExitColor().equalsIgnoreCase(tocs.get(8).getExitColor()))) {
            Person winner = tocs.get(8);
            System.out.println("The winner is " + winner.getPersonName());

        }
        else
            System.out.println("No winner in the game  : Draw Game" );

    }
}