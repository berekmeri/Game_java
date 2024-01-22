package game;

public class Player{
    private String name, ip;
    private int money;
    private ArryList<Car> cars;

    public Player(String name, String ip, int money){
        if(name == null || ip == null || ip.length() <= 0 money < 0){
            throw new IllegalArgumentException();
        }
        for(int i = 0;i <ip.length(); i++){
            if(Character.isWhitespace(ip.charAt(i))){
                throw new IllegalArgumentException();
            }
        }


        this.name = name;
        this.ip = ip;
        thsi.money = money;
        this.cars = new ArryList<Car>();
    }

}