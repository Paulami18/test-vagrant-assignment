package com.testvagrant.rcb.assignment.util;
import com.testvagrant.rcb.assignment.model.PlayerDetails;
import com.testvagrant.rcb.assignment.model.TeamDetails;
import org.json.simple.*;
import org.json.simple.parser.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadInput {

    public static TeamDetails readDataFromJson() {
        JSONParser parser = new JSONParser();
        TeamDetails teamDetails = new TeamDetails();
        List<PlayerDetails> playerDetailsList = new ArrayList<>();
        try {
            Object obj = parser.parse(new FileReader("src/main/resources/players_test_data.json"));
            JSONObject jsonObject = (JSONObject)obj;
            String name = (String)jsonObject.get("name");
            String location = (String)jsonObject.get("location");
            teamDetails.setName(name);
            teamDetails.setLocation(location);
            JSONArray players = (JSONArray)jsonObject.get("player");
            Iterator playerIterator = players.iterator();
            while (playerIterator.hasNext()) {
                PlayerDetails playerDetails = new PlayerDetails();
                JSONObject player = (JSONObject)playerIterator.next();
                playerDetails.setName((String)player.get("name"));
                playerDetails.setCountry((String)player.get("country"));
                playerDetails.setRole((String)player.get("role"));
                playerDetails.setPrice(Double.parseDouble((String)player.get("price-in-crores")));
                playerDetailsList.add(playerDetails);
            }
            teamDetails.setPlayer(playerDetailsList);


        } catch(Exception e) {
            e.printStackTrace();
        }

        return teamDetails;
    }

}
