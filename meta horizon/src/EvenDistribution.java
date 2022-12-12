import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EvenDistribution {
	  private ConcurrentHashMap<String,Double> initialPayment = new ConcurrentHashMap<>();

	    private ConcurrentHashMap<String,Double> computations;


	    public EvenDistribution (Map<String,Double> initialPayment){
	        this.initialPayment.putAll(initialPayment);
	        computations = new ConcurrentHashMap<>();
	        subtract();
	    }


	    private double getAmoutToDistribute(){

	        double totalAmount = 0;

	        for(double credit: initialPayment.values()){
	            totalAmount = totalAmount + credit;
	        }

	        double amountToDistribute = (totalAmount/initialPayment.size()); 

	        return amountToDistribute;
	    }

	    public void subtract(){

	        double amountToDistribute = getAmoutToDistribute();

	        for(String name: initialPayment.keySet()){
	            double remainingAmount =  initialPayment.get(name) - amountToDistribute ;
	            computations.put(name, remainingAmount);
	        }
	    }

	    public void calculate(){

	        for(String name: computations.keySet()){
	            Double p1amount = computations.get(name);

	            if(p1amount>0){
	                for(String tmpName: computations.keySet()){
	                    double p2amount = computations.get(tmpName);

	                    if(!tmpName.equals(name) && p2amount<0){
	                            double result = p1amount + p2amount;
	                            computations.put(name, 0D);
	                            computations.put(tmpName, result);

	                            System.out.println(name + "=>" + p1amount + "=>" + tmpName);

	                            break;
	                    }
	                }
	            }

	        }


	        for(String name: computations.keySet()){
	            if(computations.get(name)!=0){
	                calculate();
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Map<String,Double> initialPayment = new HashMap<>();

	        initialPayment.put("Apurba", 0D);
	        initialPayment.put("John", 500D);
	        initialPayment.put("Peter", 50D);
	        initialPayment.put("Tony", 1050D);
	        initialPayment.put("Loki", 400D);

	        EvenDistribution evenDistribution= new EvenDistribution(initialPayment);

	        evenDistribution.calculate();
	    }

}
