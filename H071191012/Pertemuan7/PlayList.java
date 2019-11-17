import java.util.*;
class PlayList {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> favMovie = new HashMap<>();
        favMovie.put("Title:", new ArrayList<>());
        favMovie.put("Release:", new ArrayList<>());
        favMovie.put("Duration:", new ArrayList<>());
        favMovie.put("Genre:", new ArrayList<>());
        favMovie.put("Synopsis:", new ArrayList<>());
        favMovie.put("Cast:", new ArrayList<>());
        String name = "n";
        while (name.equalsIgnoreCase("n")) {
            show(favMovie);
            System.out.println(" (d)Detail  (s)Search   (a)Add  (r)Remove");
            String type = scan.next();
            switch (type) {
                case "s":
                String  input = scan.next();
                System.out.printf(find(input, favMovie));
                System.out.println("End? (y/n");
                name = scan.next();
                break;
                case "d":
                    int command = scan.nextInt()-1;
                    detail(favMovie, command);
                    System.out.println("End? (y/n)");
                    name = scan.next();
                    break;
                case "a":
                    add(favMovie);
                    show(favMovie);
                    System.out.println("End? (y/n)");
                    name = scan.next();
                    break;
                case "r":
                    int go = scan.nextInt();
                    remove(favMovie, go);
                    show(favMovie);
                    System.out.println("End? (y/n");
                    name = scan.next();
                    break;

                default:
                    System.out.println("End? (y/n)");
                    name = scan.next();
                    break;
            }
        }
    }
    static void show (HashMap<String, ArrayList<String>> favMovie){
        ArrayList<String> title = favMovie.get("Title");
        System.out.println("Favourite movie");
        for (int i = 0; i < title.size(); i++) {
            System.out.println(i+1 + ". " + title.get(i));
        }
    }
    static void detail(HashMap<String, ArrayList<String>> favMovie, int i){
        
        System.out.println("Title    : " + favMovie.get("Title").get(i));
        System.out.println("Release    : " + favMovie.get("Release").get(i));
        System.out.println("Duration   : " + favMovie.get("Duration").get(i));
        System.out.println("Genre    : " + favMovie.get("Genre").get(i));
        System.out.println("Synopsis : " + favMovie.get("Synopsis").get(i));
        System.out.println("Cast     : " + favMovie.get("Cast").get(i));
    }
    static void add (HashMap<String, ArrayList<String>> favMovie){
        scan.nextLine();
        System.out.println("Title: ");
        String title = scan.nextLine();
        System.out.println("Release: ");
        String realease = scan.nextLine();
        System.out.println("Duration");
        String duration = scan.nextLine();
        System.out.println("Genre: ");
        String genre = scan.nextLine();
        System.out.println("Synopsis: ");
        String synopsis = scan.nextLine();
        System.out.println("Cast: ");
        String casting = scan.nextLine();

        favMovie.get("Title").add(title);
        favMovie.get("Release").add(realease);
        favMovie.get("Duration").add(duration);
        favMovie.get("Genre").add(genre);
        favMovie.get("Synopsis").add(synopsis);
        favMovie.get("Cast").add(casting);
    }
    static String find (String list, HashMap<String, ArrayList<String>> favMovie){
        ArrayList<String> title = favMovie.get("Title");
        String out = "Result ("+ list +")\n";
        for (int i = 0; i < title.size(); i++) {
            String movie = title.get(i);
            for (int j = 0; j < movie.length(); j++) {
                if(j+list.length() <= movie.length()){
                    if(list.equalsIgnoreCase(movie.substring(j,j+list.length()))){
                        out += String.format(i+1 + ", " +movie + "\n");
                        break;
                    }
                }
                else{
                    continue;
                }
            }
        }
        return out;
    }
            static void remove(HashMap<String, ArrayList<String>> favMovie, int ha){
                favMovie.get("Title").remove(ha);
                favMovie.get("Release").remove(ha);
                favMovie.get("Duration").remove(ha);
                favMovie.get("Synopsis").remove(ha);
                favMovie.get("Genre").remove(ha);
                favMovie.get("Cast").remove(ha);
    }    
}
