package hackerrank.Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by bhalchandra on 10/21/2017.
 */
public class RoadsAndLibraries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        for(int a0 = 0; a0 < q; a0++){
            long cost  = 0;
            int nCity = in.nextInt();
            int nRoad = in.nextInt();
            long cLib = in.nextLong();
            long cRoad = in.nextLong();
            if(cLib < cRoad ){
                cost = cLib * nCity;

            } else {
                cost = cLib;
                List<Integer> cities = new ArrayList<Integer>();
                for(int a1 = 0; a1 < nRoad; a1++){
                    int city_1 = in.nextInt();
                    int city_2 = in.nextInt();

                    if(cities.size() == 0){
                        cities.add(city_1);
                        cities.add(city_2);
                        cost = cost + cRoad;
                        continue;
                    }
                    if(cities.contains(city_1) && !cities.contains(city_2)){
                        cities.add(city_2);
                        cost = cost + cRoad;
                        continue;
                    }
                    if(!cities.contains(city_1) && cities.contains(city_2)){
                        cities.add(city_1);
                        cost = cost + cRoad;
                        continue;
                    }
                    if(!cities.contains(city_1) && !cities.contains(city_2)) {
                        cities.add(city_1);
                        cities.add(city_2);
                        cost = cost + cLib + cRoad;
                        continue;
                    }
                }
            }
            System.out.println(cost);
        }

    }
}
