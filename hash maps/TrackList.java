import java.util.HashMap;

public class TrackList {
    public void trackList(){
        HashMap<String, String> tracks = new HashMap<>();
        tracks.put("Lowkey", "Wanna take this downtown?");
        tracks.put("Say you wont let go", "I met you in the dark, you lift me up");
        tracks.put("old town road", "I got the horses in the back");
        tracks.put("Paper hearts","pictures I'm living through for now");
        System.out.println("The lyrics to Lowkey include: "+ tracks.get("Lowkey"));
        tracks.forEach((k,v) -> System.out.println(k+": "+v));
    }
}