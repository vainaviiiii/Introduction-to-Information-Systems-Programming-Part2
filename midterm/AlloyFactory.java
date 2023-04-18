package midterm;


import java.util.ArrayList;

public class AlloyFactory {

    // No need to modify the main method
    // It is just used for the test cases
    public static void main(String[] args) {
        AlloyFactory af = new AlloyFactory();
        ArrayList<Metal> rgIng = af.getIngredients("ROSE GOLD", 10);
        System.out.println("Rose Gold ingredients: " + rgIng);
        // Rose Gold ingredients: [Gold 7.5 gr, Copper 2.5 gr]

        ArrayList<Metal> ssIng = af.getIngredients("STERLING SILVER", 10);
        System.out.println("Sterling Silver ingredients: " + ssIng);
        // Sterling Silver ingredients: [Copper 0.75 gr, Silver 9.25 gr]

        ArrayList<Metal> bIng = af.getIngredients("BILLON", 10);
        System.out.println("Billon ingredients: " + bIng);
        // Billon ingredients: [Copper 6.0 gr, Silver 4.0 gr]
    }

    public static final String ROSEGOLD = "ROSE GOLD";
    public static final String STERLINGSILVER = "STERLING SILVER";
    public static final String BILLON = "BILLON";


    // Start working from here
    public ArrayList<Metal> getIngredients(String alloy, double totalWeight) {

        if (alloy == AlloyFactory.ROSEGOLD){
            ArrayList<Metal> output = new ArrayList<>();
            Metal gold = new Gold();
            Metal copper = new Copper();
            gold.setWeight(totalWeight*0.75);
            copper.setWeight(totalWeight*0.25);
            output.add(gold);
            output.add(copper);
            return output;
        }

        if (alloy == AlloyFactory.STERLINGSILVER){
            ArrayList<Metal> output = new ArrayList<>();
            Metal silver = new Silver();
            Metal copper = new Copper();
            silver.setWeight(totalWeight*0.925);
            copper.setWeight(totalWeight*0.075);
            output.add(silver);
            output.add(copper);
            return output;
        }

        if (alloy == AlloyFactory.BILLON){
            ArrayList<Metal> output = new ArrayList<>();
            Metal silver = new Silver();
            Metal copper = new Copper();
            silver.setWeight(totalWeight*0.4);
            copper.setWeight(totalWeight*0.6);
            output.add(silver);
            output.add(copper);
            return output;
        }

        return null;

    }
}
