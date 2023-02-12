package com.testvagrant.rcb.assignment.test;

import com.testvagrant.rcb.assignment.util.ReadInput;
import com.testvagrant.rcb.assignment.model.PlayerDetails;
import com.testvagrant.rcb.assignment.model.TeamDetails;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

public class TestScenario {
    TeamDetails teamDetails;
    @BeforeClass
    public void readData()
    {
         teamDetails= ReadInput.readDataFromJson();
    }

    @Test
    public void validateForeignPlayers()
    {
        int foreignCountryCount=0;
          List<PlayerDetails> playerDetailsList = teamDetails.getPlayer();
          for(PlayerDetails playerDetail:playerDetailsList)
          {
             if(!playerDetail.getCountry().equals("India"))
             {
                 foreignCountryCount++;
             }
          }
        Assert.assertEquals(foreignCountryCount,4);
    }
    @Test
    public void validateNumberOfKeepers()
    {
        int wicketKeeperCount=0;
        List<PlayerDetails> playerDetailsList = teamDetails.getPlayer();
        for(PlayerDetails playerDetail:playerDetailsList)
        {
            if(playerDetail.getRole().equals("Wicket-keeper"))
            {
                wicketKeeperCount++;
            }
        }
        Assert.assertTrue(wicketKeeperCount>=1);
    }

}
