package interview.walmart.interview_2023_07_13;

// Given a city name and a budget, Using REST API to find a list of food in the city that within the budget.
// https://jsonmock.hackerrank.com/api/food_outlets?city=<city>&page=<pageNumber>

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.Gson;

public class Interview {

    public List<String> findListOfFoodInCityWithinBudget(String city, int budget) throws IOException {
        List<String> ans = new ArrayList<>();

        String url1 = "https://jsonmock.hackerrank.com/api/food_outlets?city=";
        String url2 = "&page=";

        int page = 1;
        int totalPage = 1;

        while (page <= totalPage) {
            URL url = new URL(url1 + city + url2 + page);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            //con.addRequestProperty("Content-Type", "application/json");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

            String response;
            while ((response = in.readLine()) != null) {
                JsonObject jsonResponse = new Gson().fromJson(response, JsonObject.class);
                totalPage = jsonResponse.get("total_pages").getAsInt();
                // JsonArray data = jsonResponse.getAsJsonArray("data");
                JsonArray data = jsonResponse.get("data").getAsJsonArray();

                for (JsonElement e : data) {
                    int cost = e.getAsJsonObject().get("estimated_cost").getAsInt();
                    if (cost <= budget) {
                        String name = e.getAsJsonObject().get("name").getAsString();
                        ans.add(name);
                    }
                }
            }

            page++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Interview solution = new Interview();

        String city1 = "Denver";
        int budget1 = 50;
        try {
            System.out.println(solution.findListOfFoodInCityWithinBudget(city1, budget1));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

// city=Denver$page=1
/*
{
  "page": 1,
  "per_page": 10,
  "total": 40,
  "total_pages": 4,
  "data": [
    {
      "city": "Denver",
      "name": "Sushi Kashiba",
      "estimated_cost": 180,
      "user_rating": {
        "average_rating": 4.9,
        "votes": 4175
      },
      "id": 31
    },
    {
      "city": "Denver",
      "name": "Peninsula Grand Hotel",
      "estimated_cost": 120,
      "user_rating": {
        "average_rating": 4.9,
        "votes": 644
      },
      "id": 32
    },
    {
      "city": "Denver",
      "name": "Lord Of The Drinks",
      "estimated_cost": 150,
      "user_rating": {
        "average_rating": 4.7,
        "votes": 2316
      },
      "id": 33
    },
    {
      "city": "Denver",
      "name": "Lord of the Drinks",
      "estimated_cost": 150,
      "user_rating": {
        "average_rating": 4.8,
        "votes": 2086
      },
      "id": 34
    },
    {
      "city": "Denver",
      "name": "JLWA",
      "estimated_cost": 160,
      "user_rating": {
        "average_rating": 4.7,
        "votes": 2825
      },
      "id": 35
    },
    {
      "city": "Denver",
      "name": "Plum by Bent Chair",
      "estimated_cost": 180,
      "user_rating": {
        "average_rating": 4.9,
        "votes": 1657
      },
      "id": 36
    },
    {
      "city": "Denver",
      "name": "Hitchki",
      "estimated_cost": 120,
      "user_rating": {
        "average_rating": 4.8,
        "votes": 3174
      },
      "id": 37
    },
    {
      "city": "Denver",
      "name": "Carter Road Social",
      "estimated_cost": 140,
      "user_rating": {
        "average_rating": 4.6,
        "votes": 2311
      },
      "id": 38
    },
    {
      "city": "Denver",
      "name": "R' ADDA",
      "estimated_cost": 120,
      "user_rating": {
        "average_rating": 4.9,
        "votes": 4255
      },
      "id": 39
    },
    {
      "city": "Denver",
      "name": "Ada Kitchen",
      "estimated_cost": 180,
      "user_rating": {
        "average_rating": 4.5,
        "votes": 3840
      },
      "id": 310
    }
  ]
}
*/
