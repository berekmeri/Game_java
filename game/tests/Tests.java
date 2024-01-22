package game.tests;

import game.Player;

public class Tests{
    public static final double EPSILON = 0.01;

    @Test(expected = IllegalArgumentException.class)
    public void Player_ddd(){
        new Player(null, "23.4.23",10);
    }

    @Test(expected = IllegalArgumentException.class){
        public void Player_ddd(){
            new Player("sajt","34.3.2342",-10);
        }
    }
    @Test
    public void Player_konstruktorsikere(){
        new Player("sajt","h.34.3.234",10);
    }
}