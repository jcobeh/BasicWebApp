package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if(query.contains("name")) {
            return "jake the snake";
        }
        if(query.contains("what is")) {
            if(query.contains("plus")) {
                // what is 12 plus 3
                // what is 2 plus 23
                int first = Integer.parseInt(query.substring(8,10).strip());
                int second = Integer.parseInt(query.substring(15).strip());
                int result = first + second;
                return String.valueOf(result);
            }
            return "11";
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
