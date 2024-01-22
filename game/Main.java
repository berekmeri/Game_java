package game.main;

import game.Player;

public class Main{
    public static Player loadPlayerFromFile(String playerName){
    File input = new File("users/" + playerName + ".txt");

    String[] data = null;
    try (BufferedReader bf = new BufferedReader(new FileReader(input))){
        String line = bf.readLine();
        data = line.split(" ");

        return new Player(playerName, data[0],Integer.parseInt(data[1]));
    } catch (IOException e) {
        System.out.println("IO error occured: " + e.getMessage());
    } catch{
        return new Player(payerName, date[0], 0);
    }

    return null;
}

public static void main(String[] args){
    Player Daniel;
}
}