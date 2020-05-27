/*
 * ==============================================================================
 * (c) 2020
 * Fidelity National Information Services, Inc. and/or its subsidiaries - All 
 * Rights Reserved worldwide.
 * ---------------------------------------------------------------------------
 * This document is protected under the trade secret and copyright laws as the
 * property of Fidelity National Information Services, Inc. and/or its subsidiaries.
 * Copying, reproduction or distribution should be limited and only to employees
 * with a 'need to know' to do their job. Any disclosure of this document to
 * third parties is strictly prohibited.
 * =============================================================================
 */
package interviewpreparation.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class FindTop5Players
{

    public static void main(String[] args)
    {
        List<Player> players = new ArrayList<FindTop5Players.Player>();
        players.add(new Player("Vivek", 1000));
        players.add(new Player("Vithya", 2000));
        players.add(new Player("Ninju", 2400));
        players.add(new Player("Vaishu", 5000));
        players.add(new Player("Sona", 100));
        players.add(new Player("rekha", 1300));
        players.add(new Player("Rendu", 700));
        players.add(new Player("Lakshmi", 200));
        players.add(new Player("Roni", 400));
        players.add(new Player("Rajesh", 800));
        players.add(new Player("Singam", 110));
        players.add(new Player("Super", 2040));
        Collections.sort(players);
        System.out.println(players.subList(0, 5).toString());
    }

    private static class Player implements Comparable<Player>
    {
        private String name;

        private int score;

        public Player()
        {
            // TODO Auto-generated constructor stub
        }

        /**
         * @param name
         * @param score
         */
        public Player(String name, int score)
        {
            super();
            this.name = name;
            this.score = score;
        }

        /**
         * @return the name
         */
        public String getName()
        {
            return name;
        }

        /**
         * @param name the name to set
         */
        public void setName(String name)
        {
            this.name = name;
        }

        /**
         * @return the score
         */
        public int getScore()
        {
            return score;
        }

        /**
         * @param score the score to set
         */
        public void setScore(int score)
        {
            this.score = score;
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(name, score);
        }

        @Override
        public boolean equals(Object obj)
        {
            if (this == obj) return true;
            if (obj == null) return false;
            if (getClass() != obj.getClass()) return false;
            Player other = (Player) obj;
            return Objects.equals(name, other.name) && score == other.score;
        }

        @Override
        public int compareTo(Player o)
        {
            Player play = Objects.isNull(o) ? new Player() : o;
            return play.getScore() - this.score;
        }

        @Override
        public String toString()
        {
            StringBuilder builder = new StringBuilder();
            builder.append("Player [name=");
            builder.append(name);
            builder.append(", score=");
            builder.append(score);
            builder.append("]");
            return builder.toString();
        }

    }

}
