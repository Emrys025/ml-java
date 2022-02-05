//Code from 
//https://towardsdatascience.com/understanding-and-implementing-neural-networks-in-java-from-scratch-61421bb6352c

public class NeuralNetwork {
    Matrix weights_ih, weights_ho, bias_h, bias_o;
    double l_rate = 0.01;

    public NeuralNetwork(int i,int h,int o) {
        weights_ih = new Matrix(h,i);
        weights_ho = new Matrix(o,h);
        bias_h= new Matrix(h,1);
        bias_o= new Matrix(o,1);
    }
    
    
}
