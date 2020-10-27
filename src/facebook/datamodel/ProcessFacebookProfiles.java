package facebook.datamodel;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ProcessFacebookProfiles {
    public static void main(String[] args) {
        List<Profile> profile = new ArrayList<>();
        profile.add(new Profile("Ali","ali@gmail.com",
                new Location("123 Charm Ave","Queens", "NY", "USA"),
                new Message("105","20"),
                new Picture("image-1","10-26-2020")));

        Map<Integer, List<Profile>> profileMap = new LinkedHashMap<>();
        profileMap.put(1,profile);

        for(Map.Entry<Integer, List<Profile>> user:profileMap.entrySet()){
            System.out.println(user.getKey()+ " " + user.getValue().get(0).getFullName()+ " "
            + user.getValue().get(0).getEmailAddress()+ " "
            + user.getValue().get(0).getLocation().address+ " " + user.getValue().get(0).getLocation().city+ " "
                    +user.getValue().get(0).getLocation().city+ " "
                    +user.getValue().get(0).getLocation().state+ " "
                    +user.getValue().get(0).getLocation().country+ " "
                    +user.getValue().get(0).getPicture().image+ " "
                    +user.getValue().get(0).getPicture().getPostDate());
        }
    }
}
