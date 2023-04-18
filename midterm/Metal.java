package midterm;
public abstract class Metal implements Conductive, Resistive {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Metal(){
        setWeight(1);
    }
}


class Copper extends Metal {
    @Override
    public double getConductivity() {
        return 6.0*(100000000);
    }

    @Override
    public double getResistivity() {
        return 1.7*(0.0000001);
    }

    @Override
    public String toString(){
        String output="";
        output += "Copper ";
        output += String.valueOf(getWeight());
        output += " gr";
        return output;
    }
}


class Silver extends Metal {
    @Override
    public double getConductivity() {
        return 6.2*(100000000);
    }

    @Override
    public double getResistivity() {
        return 1.6*(0.0000001);
    }

    @Override
    public String toString(){
        String output="";
        output += "Silver ";
        output += String.valueOf(getWeight());
        output += " gr";
        return output;
    }
}


class Gold extends Metal {
    @Override
    public double getConductivity() {
        return 4.1*(100000000);
    }

    @Override
    public double getResistivity() {
        return 2.4*(0.0000001);
    }

    @Override
    public String toString(){
        String output="";
        output += "Gold ";
        output += String.valueOf(getWeight());
        output += " gr";
        return output;
    }
}
