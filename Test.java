import java.util.ArrayList;
import java.util.List;

public class Test {

    static double[][] input = {{1134,222,3,45,5134,6,7},{553,42352342,232,7234,4,2253,5},
    {2,323,4,1345,6,2,9},{9,23527,5,3,7,5,3},{9,32,532,353,3242,12,2}};
    static double[][] output = {{1},{1},{0},{1},{0}};

    public static void main(String[] args){
        NeuralNetwork sevenToOne = new NeuralNetwork(7, 20, 1);
        sevenToOne.learn(input, output, 200000000);

        List<List<Double>> Output  = new ArrayList<List<Double>>();

        double[][] Input = {{553,42352342,232,7234,4,2253,5},{9,32,532,353,3242,12,2},
        {2,323,4,1345,6,2,9},{9,23527,5,3,7,5,3},{1134,222,3,45,5134,6,7}};

        for (int i=0; i<Input.length; i++){
            Output.add(sevenToOne.predict(Input[i]));
        }

        System.out.println(Output.toString());
    }
    
}
