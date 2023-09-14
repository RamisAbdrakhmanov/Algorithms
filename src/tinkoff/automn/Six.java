package tinkoff.automn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Six {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] spiritAndQuestions = br.readLine().split(" ");

        int amount = Integer.parseInt(spiritAndQuestions[0]);
        int questions = Integer.parseInt(spiritAndQuestions[1]);

        List<Spirit> spirits = new ArrayList<>();
        spirits.add(null);

        for (int i = 0; i < amount; i++) {
            Spirit spirit = createSpirit(i + 1);
            spirits.add(spirit);
        }

        while (questions-->0) {
            String[] quest = br.readLine().split(" ");
            switch (quest[0]) {
                case "1" -> {
                    Spirit one = spirits.get(Integer.parseInt(quest[1]));
                    Spirit two = spirits.get(Integer.parseInt(quest[2]));
                    mergeTeams(one, two);
                }
                case "2" -> {
                    Spirit one = spirits.get(Integer.parseInt(quest[1]));
                    Spirit two = spirits.get(Integer.parseInt(quest[2]));
                    isSpiritsInOneTeam(one, two);
                }
                case "3" -> System.out.println(spirits.get(Integer.parseInt(quest[1])).getTeams());
                default -> System.out.println("Bad quest");
            }
        }
    }

    public static Spirit createSpirit(int id) {
        Spirit spirit = new Spirit(id);
        Set<Spirit> spirits = new HashSet<>();
        spirits.add(spirit);
        spirit.setTeammates(spirits);
        return spirit;
    }

    public static void mergeTeams(Spirit one, Spirit two) {
        Set<Spirit> spirits = one.getTeammates();
        spirits.addAll(two.getTeammates());
        for (Spirit spirit : spirits) {
            spirit.setTeams(spirit.getTeams() + 1);
            spirit.setTeammates(spirits);
        }
    }

    public static void isSpiritsInOneTeam(Spirit one, Spirit two) {
        Set<Spirit> spirits = one.getTeammates();
        if (spirits.contains(one) && spirits.contains(two)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}

class Spirit {
    private int id;
    private int teams;
    private Set<Spirit> teammates;

    public Spirit(int id) {
        this.id = id;
        this.teams = 1;
    }

    public int getId() {
        return id;
    }

    public int getTeams() {
        return teams;
    }

    public Set<Spirit> getTeammates() {
        return teammates;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTeammates(Set<Spirit> teammates) {
        this.teammates = teammates;
    }

    public void setTeams(int teams) {
        this.teams = teams;
    }
}



