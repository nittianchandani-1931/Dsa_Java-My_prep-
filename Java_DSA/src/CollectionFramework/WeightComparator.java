package CollectionFramework;

import java.util.Comparator;

public class WeightComparator implements Comparator<BtechStudent> {
    @Override 
        public int compare(BtechStudent o1, BtechStudent o2){
            return o1.weight -o2.weight;
        }
    }
