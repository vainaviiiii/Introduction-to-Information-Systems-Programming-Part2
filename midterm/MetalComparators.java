package midterm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


// No need to modify public class MetalComparators.
// It is just used for the test cases.
public class MetalComparators {
    public static void main(String[] args) {
        Copper c = new Copper();
        Gold g = new Gold();
        Silver s = new Silver();
        c.setWeight(3.2);
        s.setWeight(0.5);

        ArrayList<Metal> arr = new ArrayList<>();
        arr.add(c);  arr.add(g);  arr.add(s);

        System.out.println("Before sorting: " + arr);
        // Before sorting: [Copper 3.2 gr, Gold 1.0 gr, Silver 0.5 gr]

        Collections.sort(arr, new WeightComparator());
        System.out.println("Sort by weight: " + arr);
        // Sort by weight: [Silver 0.5 gr, Gold 1.0 gr, Copper 3.2 gr]

        Collections.sort(arr, new ConductivityComparator());
        System.out.println("Sort by conductivity: " + arr);
        // Sort by conductivity: [Gold 1.0 gr, Copper 3.2 gr, Silver 0.5 gr]

        Collections.sort(arr, new ResistivityComparator());
        System.out.println("Sort by resistivity: " + arr);
        // Sort by resistivity: [Silver 0.5 gr, Copper 3.2 gr, Gold 1.0 gr]

    }
}

// Start working from here
class ConductivityComparator implements Comparator<Metal> {
    public int compare(Metal a, Metal b){
        if(a.getConductivity()>b.getConductivity()){
            return 1;
        }
        else if(a.getConductivity()==b.getConductivity()){
            return 0;
        }
        return -1;
    }



}

class ResistivityComparator implements Comparator<Metal> {

    public int compare(Metal a, Metal b){
        if(a.getResistivity()>b.getResistivity()){
            return 1;
        }
        else if(a.getResistivity()==b.getResistivity()){
            return 0;
        }
        return -1;
    }


}

class WeightComparator implements Comparator<Metal> {



    public int compare(Metal a, Metal b){
        if(a.getWeight()>b.getWeight()){
            return 1;
        }
        else if(a.getWeight()==b.getWeight()){
            return 0;
        }
        return -1;
    }

}