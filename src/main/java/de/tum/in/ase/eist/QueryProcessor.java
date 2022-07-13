package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if(query.contains("name")) {
            return "jake the snake";
        }
        if(query.contains("which of the following numbers is the largest")) {
            String[] tokens = query.split(": ")[2].split(", ");
            int largest = -1;
            for(int i = 0; i < tokens.length; i++) {
                int currentInt = Integer.parseInt(tokens[i]);
                if(currentInt > largest) {
                    largest = currentInt;
                }
            }
            return String.valueOf(largest);
        }
        if(query.contains("what is")) {
            if(query.contains("plus")) {
                // xy: what is 12 plus 3
                // xy: what is 2 plus 23
                String[] tokens = query.split(" ");

                int first = Integer.parseInt(tokens[3]);
                int second = Integer.parseInt(tokens[5]);
                int result = first + second;
                return String.valueOf(result);
            }
        }
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "MyTeam";
        } else { // TODO extend the programm here
            return "";
        }
        // just to comment sth
    }
}
